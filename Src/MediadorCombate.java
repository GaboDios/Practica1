import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code MediadorCombate} se encarga de gestionar las notificaciones de eventos de combate
 * a todos los espectadores registrados.
 */
public class MediadorCombate {
    private List<Observador> espectadores;

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
     * @param resultadoFinal El resultado final del combate.
     */
    public void finalizarCombate(boolean ganoPersonajeApoyado) {
        for (Observador espectador : espectadores) {
            if (espectador instanceof Espectador) {
                ((Espectador) espectador).finalizarCombate(ganoPersonajeApoyado);
            }
        }
    }

    public void shutdown() {
        for (Observador espectador : espectadores) {
            if (espectador instanceof Espectador) {
                ((Espectador) espectador).finalizarCombate(false);
            }
        }
    }
}
