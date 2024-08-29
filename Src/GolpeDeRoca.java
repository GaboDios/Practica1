/**
 * La clase {@code GolpeDeRoca} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje utiliza un golpe de roca.
 */
public class GolpeDeRoca implements Strategy {

    /**
     * Ejecuta el ataque cuando el personaje utiliza un golpe de roca.
     * El atacante golpea al objetivo con una roca, causando daño.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Golpe de Roca.");
        objetivo.reducirVida(10);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con un golpe de roca.
     * El atacante lanza un golpe de roca, pero el objetivo defiende con éxito.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Golpe de Roca, pero " + objetivo.getNombre() + " ha defendido.");
    }
}
