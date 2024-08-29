import java.io.FileWriter;
import java.io.IOException;

public class Espectador implements Observador {
    private String id;
    private String personajeApoyado;
    private FileWriter bitacora;
    private boolean combateFinalizado;

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

    public String getPersonajeApoyado() {
        return personajeApoyado;
    }
}
