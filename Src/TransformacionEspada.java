/**
 * La clase {@code TransformacionEspada} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje se transforma en una espada.
 * Al transformarse, el personaje ataca como un kamikaze, lanzándose directamente contra su objetivo.
 */
public class TransformacionEspada implements Strategy{

    /**
     * Ejecuta el ataque cuando el personaje se ha transformado en una espada.
     * El atacante se convierte en espada y se lanza como un kamikaze contra el objetivo, causando un gran daño.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Espada y se ha lanzado como kamikaze contra " + objetivo.getNombre() + " causando un gran daño en el corazón.");
        objetivo.reducirVida(10);
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
