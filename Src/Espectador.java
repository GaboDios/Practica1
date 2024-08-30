import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase {@code Espectador} implementa la interfaz {@code Observador} y representa
 * a un espectador que sigue el progreso de un personaje en un combate. Cada espectador
 * apoya a un personaje específico y registra los eventos del combate en una bitácora.
 */
public class Espectador implements Observador {
    private String id;
    private String personajeApoyado;
    private FileWriter bitacora;
    private boolean combateFinalizado;

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
        this.combateFinalizado = false;
        try {
            bitacora = new FileWriter(id + "_bitacora.txt");
            // Escribir en la primera línea a quién está apoyando el espectador
            bitacora.write("Este espectador está apoyando a: " + personajeApoyado + "\n");
            bitacora.flush(); // Asegurar que se escriba la primera línea inmediatamente
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que se invoca cuando se notifica al espectador de un evento relacionado con el combate.
     * El mensaje del evento se escribe en la bitácora, a menos que el combate haya finalizado.
     *
     * @param mensaje El mensaje que describe el evento del combate.
     */
    @Override
    public void actualizar(String mensaje) {
        if (combateFinalizado) {
            return;
        }
        try {
            bitacora.write(mensaje + "\n");
            bitacora.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Finaliza el combate, escribiendo el resultado en la bitácora y cerrando el archivo.
     * Evita que se registren más eventos después de que el combate haya terminado.
     *
     * @param ganoPersonajeApoyado Indica si el personaje apoyado ganó el combate.
     */
    public void finalizarCombate(boolean ganoPersonajeApoyado) {
        if (combateFinalizado) {
            return;
        }
        combateFinalizado = true;
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
