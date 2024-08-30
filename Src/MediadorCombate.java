import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code MediadorCombate} se encarga de gestionar las notificaciones de eventos de combate
 * a todos los espectadores registrados. Esta clase facilita la comunicación entre los personajes y los espectadores.
 */
public class MediadorCombate {
    private List<Observador> espectadores;

    /**
     * Constructor que inicializa el mediador de combate con una lista vacía de espectadores.
     */
    public MediadorCombate() {
        espectadores = new ArrayList<>();
    }

    /**
     * Registra un nuevo espectador para recibir notificaciones de eventos del combate.
     *
     * @param espectador El espectador que se registrará.
     */
    public void registrarEspectador(Observador espectador) {
        espectadores.add(espectador);
    }

    /**
     * Notifica a todos los espectadores sobre un evento del combate.
     *
     * @param evento El mensaje que describe el evento del combate.
     * @param personajeInvolucrado El nombre del personaje involucrado en el evento.
     */
    public void notificar(String evento, String personajeInvolucrado) {
        for (Observador espectador : espectadores) {
            //espectador.actualizar(evento + " involucrando a " + personajeInvolucrado);
            espectador.actualizar(personajeInvolucrado);
        }
    }

    /**
     * Finaliza el combate, notificando el resultado a todos los espectadores.
     *
     * @param ganoPersonajeApoyado Indica si el personaje apoyado por los espectadores ganó el combate.
     */
    public void finalizarCombate(boolean ganoPersonajeApoyado) {
        for (Observador espectador : espectadores) {
            if (espectador instanceof Espectador) {
                ((Espectador) espectador).finalizarCombate(ganoPersonajeApoyado);
            }
        }
    }

    /**
     * Apaga el mediador, notificando a todos los espectadores que el combate ha terminado.
     * Este método asegura que no se envíen más notificaciones después de que el combate finaliza.
     */
    public void shutdown() {
        for (Observador espectador : espectadores) {
            if (espectador instanceof Espectador) {
                ((Espectador) espectador).finalizarCombate(false);
            }
        }
    }
}
