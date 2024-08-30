/**
 * La clase abstracta {@code Copcam} extiende la clase {@code Personaje} y define un conjunto específico
 * de poderes que solo los personajes de tipo Copcam pueden utilizar. Los poderes asignados a un personaje
 * de tipo Copcam son fijos y no pueden ser modificados por las clases derivadas.
 */
public abstract class Copcam extends Personaje {

    /**
     * Constructor para inicializar un personaje de tipo Copcam con un nombre, una cantidad de vida,
     * y un mediador de combate. Los poderes asignados a un personaje de tipo Copcam son
     * {@code BombaDeEnergia}, {@code GolpeDeRoca}, y {@code RayoElectrico}.
     *
     * @param nombre El nombre del personaje.
     * @param vida La cantidad inicial de vida del personaje.
     * @param mediador El mediador que gestionará las notificaciones a los observadores.
     */
    public Copcam(String nombre, int vida, MediadorCombate mediador) {
        super(nombre, vida, new BombaDeEnergia(), new GolpeDeRoca(), new RayoElectrico(), mediador);
    }

}
