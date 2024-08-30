/**
 * La clase {@code Dittuu} es una subclase de {@code Personaje} que representa
 * a un personaje específico llamado Dittuu. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: Ataque de Fuego,
 * Ataque Torbellino y Cañon de Hielo.
 */
public class Dittuu extends Personaje {

    /**
     * Constructor que crea una instancia de Dittuu con un nombre predeterminado
     * de "Dittuu", 100 puntos de vida, y tres ataques predefinidos: Ataque de Fuego,
     * Ataque Torbellino y Cañón de Hielo.
     *
     * @param mediador El mediador que gestiona las interacciones del combate entre los personajes.
     */
    public Dittuu(MediadorCombate mediador) {
        super("Dittuu", 100, new AtaqueFuego(), new AtaqueTorbellino(), new CañonDeHielo(), mediador);
    }
}
