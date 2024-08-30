/**
 * La clase {@code AtaqueFuego} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa específicos para cuando un
 * personaje utiliza fuego como arma.
 */
public class AtaqueFuego implements Strategy {

    private static final int DANIO_FUEGO = 10;

    /**
     * Ejecuta el ataque cuando el personaje utiliza fuego.
     * El personaje ataca al objetivo con fuego, reduciendo la vida del objetivo.
     * Y se notifica este evento en la bitácora.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        String mensaje = " ha lanzado un ataque de fuego hacia " + objetivo.getNombre();
        atacante.notificar(atacante.getNombre() + mensaje);
        objetivo.reducirVida(DANIO_FUEGO);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con fuego.
     * El atacante lanza un ataque de fuego, pero el objetivo lo defiende con éxito.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con fuego, pero " + objetivo.getNombre() + " ha defendido");
    }

}
