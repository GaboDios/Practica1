/**
 * La clase {@code Korby} es una subclase de {@code Nientiendo} que representa
 * a un personaje específico llamado Korby. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: {@code AtaqueFuego},
 * {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
 */
public class Korby extends Nientiendo {

    /**
     * Constructor que crea una instancia de Korby con un nombre predeterminado
     * de "Korby", 100 puntos de vida, y tres ataques predefinidos: {@code AtaqueFuego},
     * {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
     *
     * @param mediador El mediador que gestiona las interacciones del combate entre los personajes.
     */
    public Korby(MediadorCombate mediador) {
        super("Korby", 100, mediador);
    }
}
