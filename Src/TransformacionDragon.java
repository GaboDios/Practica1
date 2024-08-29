/**
 * La clase {@code TransformacionDragon} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje se transforma en un dragón.
 * Al transformarse, el personaje escupe bolas de fuego para atacar y defenderse.
 */
public class TransformacionDragon implements Strategy {

    private static final int DANIO_DRAGON = 10;

    /**
     * Ejecuta el ataque cuando el personaje se ha transformado en dragón.
     * El atacante se convierte en dragón y lanza una bola de fuego al objetivo, causando un gran daño.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
     @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Dragon y ha escupido una bola de fuego a " + objetivo.getNombre() + " causando un gran daño.");
        objetivo.reducirVida(DANIO_DRAGON);
    }

    /**
     * Ejecuta la defensa cuando el personaje se ha transformado en dragón.
     * El atacante se convierte en dragón y lanza una bola de fuego al objetivo, pero el objetivo se defiende haciéndose a un costado.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Dragon y ha escupido una bola de fuego a " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " ha defendido haciendose a un costado");
    }
    
}
