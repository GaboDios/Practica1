/**
 * La clase abstracta {@code Chinpokomon} extiende la clase {@code Personaje} y define un conjunto específico
 * de poderes que solo los personajes de tipo Chinpokomon pueden utilizar. Los poderes asignados a un personaje
 * de tipo Chinpokomon son fijos y no pueden ser modificados por las clases derivadas.
 */
public abstract class Chinpokomon extends Personaje {

    /**
     * Constructor para inicializar un personaje de tipo Chinpokomon con un nombre, una cantidad de vida,
     * y un mediador de combate. Los poderes asignados a un personaje de tipo Chinpokomon son
     * {@code AtaqueFuego}, {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
     *
     * @param nombre El nombre del personaje.
     * @param vida La cantidad inicial de vida del personaje.
     * @param mediador El mediador que gestionará las notificaciones a los observadores.
     */
    public Chinpokomon(String nombre, int vida, MediadorCombate mediador) {
        super(nombre, vida, new AtaqueFuego(), new AtaqueTorbellino(), new CanionDeHielo(), mediador);
    }

    // Los poderes son específicos de Chinpokomon, y no pueden ser modificados en las clases derivadas
}
