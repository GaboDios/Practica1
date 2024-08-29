/**
 * La clase {@code RayoElectrico} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje utiliza
 * un rayo eléctrico como arma.
 */
public class RayoElectrico implements Strategy {

    /**
     * Ejecuta el ataque cuando el personaje utiliza un rayo eléctrico.
     * El atacante ataca al objetivo con un rayo eléctrico, reduciendo la vida del objetivo.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Rayo Electrico.");
        objetivo.reducirVida(10);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con un rayo eléctrico.
     * El atacante lanza un ataque con rayo eléctrico, pero el objetivo lo defiende con éxito.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha atacado a " + objetivo.getNombre() + " con Rayo Electrico, pero " + objetivo.getNombre() + " ha defendido");
    }

}
