/**
 * La clase {@code Meganman} es una subclase de {@code Personaje} que representa
 * a un personaje específico llamado Meganman. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: Bomba de Energía,
 * Golpe de Roca y Rayo Eléctrico.
 */
public class Meganman extends Personaje {

    /**
     * Constructor que crea una instancia de Meganman con el mismo nombre predeterminado
     * 100 puntos de vida, y tres ataques predefinidos:
     * Bomba de Energía, Golpe de Roca y Rayo Eléctrico.
     *
     * @param mediador El mediador que gestiona las interacciones del combate con los obersavadores.
     */
    public Meganman(MediadorCombate mediador) {
        super("Meganman", 100, new BombaDeEnergia(), new GolpeDeRoca(), new RayoElectrico(), mediador);
    }
}

