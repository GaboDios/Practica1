/**
 * La clase abstracta {@code Nientiendo} extiende la clase {@code Personaje} y define un conjunto específico
 * de poderes que solo los personajes de tipo Nientiendo pueden utilizar. Los poderes asignados a un personaje
 * de tipo Nientiendo son fijos y no pueden ser modificados por las clases derivadas.
 */
public abstract class Nientiendo extends Personaje {

    /**
     * Constructor para inicializar un personaje de tipo Nientiendo con un nombre, una cantidad de vida,
     * y un mediador de combate. Los poderes asignados a un personaje de tipo Nientiendo son
     * {@code AtaqueFuego}, {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
     *
     * @param nombre El nombre del personaje.
     * @param vida La cantidad inicial de vida del personaje.
     * @param mediador El mediador que gestionará las notificaciones a los observadores.
     */
    public Nientiendo(String nombre, int vida, MediadorCombate mediador) {
        super(nombre, vida, new AtaqueFuego(), new AtaqueTorbellino(), new CañonDeHielo(), mediador);
    }

}
