/**
 * La clase {@code Korby} es una subclase de {@code Personaje} que representa
 * a un personaje específico llamado Korby. Este personaje tiene un nombre fijo,
 * una vida inicial de 100 puntos, y tres ataques predeterminados: Ataque de Fuego,
 * Ataque Torbellino y Cañon de Hielo.
 */
public class Korby extends Personaje {

    /**
     * Constructor que crea una instancia de Korby con un nombre predeterminado
     * de "Korby", 100 puntos de vida, y tres ataques predefinidos.
     */
    public Korby() {
        super("Korby", 100, new AtaqueFuego(), new AtaqueTorbellino(), new CañonDeHielo());
    }

    // Método getNombre() comentado para evitar redundancia con la clase base

    // Si se requiere sobrescribir el método getNombre(), se puede descomentar este bloque
    // @Override
    // public String getNombre() {
    //     return "Korby";
    // }
}
