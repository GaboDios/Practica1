/**
 * La clase {@code Meganman} es una subclase de {@code Copcam} que representa
 * a un personaje específico llamado Meganman. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: {@code BombaDeEnergia},
 * {@code GolpeDeRoca}, y {@code RayoElectrico}.
 */
public class Meganman extends Copcam {

    /**
     * Constructor que crea una instancia de Meganman con un nombre predeterminado,
     * 100 puntos de vida, y tres ataques predefinidos: {@code BombaDeEnergia},
     * {@code GolpeDeRoca}, y {@code RayoElectrico}.
     *
     * @param mediador El mediador que gestiona las interacciones del combate con los observadores.
     */
    public Meganman(MediadorCombate mediador) {
        super("Meganman", 100, mediador);
    }
}
