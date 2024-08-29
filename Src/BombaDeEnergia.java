/**
 * La clase {@code BombaDeEnergia} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa cuando un personaje utiliza una bomba de energía.
 */
public class BombaDeEnergia implements Strategy {

    /**
     * Ejecuta el ataque cuando el personaje lanza una bomba de energía.
     * El atacante lanza la bomba de energía al objetivo, causando daño.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha lanzado Bomba de Energia a " + objetivo.getNombre());
        objetivo.reducirVida(10);
    }

    /**
     * Ejecuta la defensa cuando el personaje es atacado con una bomba de energía.
     * El atacante lanza una bomba de energía, pero el objetivo la toma y la lanza de regreso, causando daño al atacante.
     *
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " ha lanzado Bomba de Energia a " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " la ha tomado y arrojado de regreso");
        atacante.reducirVida(10);
    }
}
