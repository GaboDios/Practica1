/**
 * La clase {@code TransformacionTanque} implementa la interfaz {@code Strategy}
 * y define los comportamientos de ataque y defensa específicos para cuando un 
 * personaje se transforma en tanque.
 */
public class TransformacionTanque implements Strategy{

    /**
     * Ejecuta el ataque cuando el personaje se ha transformado en tanque.
     * El atacante lanza un proyectil al objetivo causando un gran daño.
     *
     * @paramn atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que recibe el ataque.
     */

    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Tanque y ha lanzado un proyectil a " + objetivo.getNombre() + " causando un gran daño.");
        objetivo.reducirVida(10);
    }

    /**
     * Ejecuta la defensa cuando el personaje se ha transformado en tanque.
     * El atacante lanza un proyectil al objetivo, pero el objetivo lo defiende
     * absorbiendo el impacto.
     * @param atacante El personaje que realiza el ataque.
     * @param objetivo El personaje que defiende el ataque.
     */
    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + " se ha convertido en Tanque y ha lanzado un proyectil a " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " ha defendido absorbiendo el impacto");
    }
    
}
