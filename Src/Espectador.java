import java.io.FileWriter;
import java.io.IOException;

public class Espectador implements Observador {
    private String id;
    private String personajeApoyado;
    private FileWriter bitacora;

    public Espectador(String id, String personajeApoyado) {
        this.id = id;
        this.personajeApoyado = personajeApoyado;
        try {
            bitacora = new FileWriter(id + "_bitacora.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(String mensaje) {
        try {
            bitacora.write(mensaje + "\n");
            bitacora.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void finalizarCombate(boolean ganoPersonajeApoyado) {
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
