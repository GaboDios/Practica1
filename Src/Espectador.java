import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase {@code Espectador} implementa la interfaz {@code Observador} y
 * representa a un espectador que sigue el progreso de un personaje en un combate.
 * Cada espectador apoya a un personaje específico y registra los eventos del combate
 * en una bitácora.
 */
public class Espectador implements Observador {
    private String id;
    private String personajeApoyado;
    private FileWriter bitacora;

    /**
     * Constructor que crea un espectador con un identificador único y el personaje al que apoya.
     * También inicializa la bitácora donde se registrarán los eventos del combate.
     *
     * @param id El identificador único del espectador.
     * @param personajeApoyado El nombre del personaje que el espectador apoya.
     */
    public Espectador(String id, String personajeApoyado) {
        this.id = id;
        this.personajeApoyado = personajeApoyado;
        try {
            bitacora = new FileWriter(id + "_bitacora.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que se invoca cuando se notifica al espectador de un evento relacionado con el combate.
     * El mensaje del evento se escribe en la bitácora.
     *
     * @param mensaje El mensaje que describe el evento del combate.
     */
    @Override
    public void actualizar(String mensaje) {
        try {
            bitacora.write(mensaje + "\n");
            bitacora.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Finaliza el combate, escribiendo el resultado en la bitácora y cerrando el archivo.
     *
     * @param ganoPersonajeApoyado Indica si el personaje apoyado ganó el combate.
     */
    public void finalizarCombate(boolean ganoPersonajeApoyado) {
        try {
            String resultado = ganoPersonajeApoyado ? "¡Ganó el personaje que apoyaste!" : "Perdió el personaje que apoyaste.";
            bitacora.write(resultado + "\n");
            bitacora.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retorna el nombre del personaje que el espectador apoya.
     *
     * @return El nombre del personaje apoyado por el espectador.
     */
    public String getPersonajeApoyado() {
        return personajeApoyado;
    }
}
