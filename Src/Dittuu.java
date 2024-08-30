/**
 * La clase {@code Dittuu} es una subclase de {@code Chinpokomon} que representa
 * a un personaje específico llamado Dittuu. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: {@code AtaqueFuego},
 * {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
 */
public class Dittuu extends Chinpokomon {

    /**
     * Constructor que crea una instancia de Dittuu con un nombre predeterminado
     * de "Dittuu", 100 puntos de vida, y tres ataques predefinidos: {@code AtaqueFuego},
     * {@code AtaqueTorbellino}, y {@code CañonDeHielo}.
     *
     * @param mediador El mediador que gestiona las interacciones del combate entre los personajes.
     */
    public Dittuu(MediadorCombate mediador) {
        super("Dittuu", 100, mediador);
    }
}
