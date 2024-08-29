/**
 * La clase {@code CañonDeHielo} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje utiliza un cañón de hielo.
 */
public class CañonDeHielo implements Strategy {

    private static final int DANIO_HIELO = 10;

    /**
     * Ejecuta el ataque cuando el personaje utiliza un cañón de hielo.
     * El atacante dispara el cañón de hielo al objetivo, reduciendo su vida.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Cañon de Hielo.");
        objetivo.reducirVida(DANIO_HIELO);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con un cañón de hielo.
     * El atacante dispara el cañón de hielo, pero el objetivo defiende con éxito.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Cañon de Hielo pero " + objetivo.getNombre() + " ha defendido.");
    }
}
