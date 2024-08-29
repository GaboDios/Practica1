/**
 * La clase {@code Prueba} es el punto de entrada para ejecutar una simulación
 * de combate entre personajes en el juego. Esta clase crea instancias de personajes
 * y observadores, los registra, y luego simula un combate entre los personajes,
 * notificando a los observadores sobre los eventos ocurridos.
 */
public class Prueba {

    /**
     * El método principal que ejecuta la simulación de combate.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta simulación).
     */
    public static void main(String[] args) {
        // Crear personajes
        Personaje korby = new Korby();
        Personaje meganman = new Meganman();
        Personaje dittuu = new Dittuu();

        // Crear espectadores
        Espectador espectador1 = new Espectador("espectador1", "Korby");
        Espectador espectador2 = new Espectador("espectador2", "Meganman");
        Espectador espectador3 = new Espectador("espectador3", "Dittuu");

        // Registrar observadores en los personajes
        korby.agregarObservador(espectador1);
        meganman.agregarObservador(espectador2);
        dittuu.agregarObservador(espectador3);

        // Simular combate
        korby.seleccionarPoder(1);
        meganman.seleccionarPoder(2);
        dittuu.seleccionarPoder(3);

        korby.realizarAtaque(meganman);
        meganman.realizarDefensa(korby);
        dittuu.realizarAtaque(korby);
        

        // Evaluar si los personajes han muerto y notificar a los espectadores
        if (korby.getVida() <= 0) {
            espectador1.finalizarCombate(false);
        } else {
            espectador1.finalizarCombate(true);
        }

        if (meganman.getVida() <= 0) {
            espectador2.finalizarCombate(false);
        } else {
            espectador2.finalizarCombate(true);
        }

        if (dittuu.getVida() <= 0) {
            espectador3.finalizarCombate(false);
        } else {
            espectador3.finalizarCombate(true);
        }
    }
}
