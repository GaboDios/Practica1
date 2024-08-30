/**
 * La clase {@code TransformacionEspada} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje se transforma en una espada.
 * Al transformarse, el personaje ataca como un kamikaze, lanzándose directamente contra su objetivo.
 */
public class TransformacionEspada implements Strategy{

    private static final int DANIO_ESPADA = 10;

    /**
     * Ejecuta el ataque cuando el personaje se ha transformado en una espada.
     * El atacante se convierte en espada y se lanza como un kamikaze contra el objetivo, causando un gran daño.
     * Y se notifica a la bitácora.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        String mensaje = " se ha convertido en Espada y se ha lanzado como kamikaze contra " + objetivo.getNombre()+ " causando un gran daño en el corazón";
        atacante.notificar(atacante.getNombre() + mensaje);
        objetivo.reducirVida(DANIO_ESPADA);
    }

    /**
     * Ejecuta la defensa cuando el personaje se ha transformado en una espada.
     * El atacante se convierte en espada y se lanza como un kamikaze contra el objetivo, pero el objetivo se defiende esquivando el ataque.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Espada y se ha lanzado como kamikaze contra " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " ha defendido esquivandolo");
    }
    
}
