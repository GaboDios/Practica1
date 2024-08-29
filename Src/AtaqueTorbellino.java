/**
 * La clase {@code AtaqueTorbellino} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje utiliza un ataque de torbellino.
 */
public class AtaqueTorbellino implements Strategy {

    /**
     * Ejecuta el ataque cuando el personaje utiliza un ataque de torbellino.
     * El atacante ataca al objetivo con un torbellino, reduciendo la vida del objetivo.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Ataque Torbellino.");
        objetivo.reducirVida(10);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con un torbellino.
     * El atacante lanza un ataque de torbellino, pero el objetivo lo defiende con éxito.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Ataque Torbellino, pero " + objetivo.getNombre() + " ha defendido.");
    }
}
