import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Prueba} contiene el método principal para ejecutar el programa
 * que simula diferentes escenarios de combate entre personajes. Permite al usuario
 * seleccionar un escenario de combate y visualizar los resultados.
 */

public class Prueba {
    /**
     * El método principal que inicia el programa, permite al usuario seleccionar
     * un escenario de combate y maneja la interacción con el usuario.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        MediadorCombate mediador = new MediadorCombate();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    escenarioKorbyGana(mediador);
                    break;
                case 2:
                    escenarioMeganmanGana(mediador);
                    break;
                case 3:
                    escenarioDittuuGana(mediador);
                    break;
                case 4:
                    escenarioAleatorio(mediador);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
            }
            System.out.println();
        } while (opcion != 5);

        mediador.shutdown();
        scanner.close();
    }

    /**
     * Muestra el menú de opciones en la consola para que el usuario seleccione un escenario de combate.
     */
    private static void mostrarMenu() {
        System.out.println("===== Menú de Escenarios de Combate =====");
        System.out.println("1. Escenario: Korby Gana");
        System.out.println("2. Escenario: Meganman Gana");
        System.out.println("3. Escenario: Dittuu Gana");
        System.out.println("4. Escenario: Combate Aleatorio");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    /**
     * Simula un escenario de combate donde Korby es el ganador.
     * Se crean los personajes, los espectadores y se registran en el mediador.
     * Luego, se simula el combate hasta que Korby gana.
     *
     * @param mediador El mediador que gestiona las interacciones del combate.
     */
    public static void escenarioKorbyGana(MediadorCombate mediador) {
        // Crear personajes
        Personaje korby = new Korby(mediador);
        Personaje meganman = new Meganman(mediador);
        Personaje dittuu = new Dittuu(mediador);

        // Crear espectadores
        Espectador espectador1 = new Espectador("espectador1", "Korby");
        Espectador espectador2 = new Espectador("espectador2", "Meganman");
        Espectador espectador3 = new Espectador("espectador3", "Dittuu");

        // Registrar los espectadores en el mediador
        mediador.registrarEspectador(espectador1);
        mediador.registrarEspectador(espectador2);
        mediador.registrarEspectador(espectador3);

        korby.seleccionarPoder(1);
        meganman.seleccionarPoder(2);
        dittuu.seleccionarPoder(3);

        korby.realizarAtaque(meganman);
        meganman.realizarDefensa(korby);
        korby.realizarAtaque(dittuu);

        while (meganman.getVida() > 0) {
            korby.realizarAtaque(meganman);
        }
        while (dittuu.getVida() > 0) {
            korby.realizarAtaque(dittuu);
        }

        espectador1.finalizarCombate(true);  // Korby gana
        espectador2.finalizarCombate(false);
        espectador3.finalizarCombate(false);
    }

    /**
     * Simula un escenario de combate donde Meganman es el ganador.
     * Se crean los personajes, los espectadores y se registran en el mediador.
     * Luego, se simula el combate hasta que Meganman gana.
     *
     * @param mediador El mediador que gestiona las interacciones del combate.
     */
    public static void escenarioMeganmanGana(MediadorCombate mediador) {
        // Crear personajes
        Personaje korby = new Korby(mediador);
        Personaje meganman = new Meganman(mediador);
        Personaje dittuu = new Dittuu(mediador);

        // Crear espectadores
        Espectador espectador1 = new Espectador("espectador1", "Korby");
        Espectador espectador2 = new Espectador("espectador2", "Meganman");
        Espectador espectador3 = new Espectador("espectador3", "Dittuu");

        // Registrar los espectadores en el mediador
        mediador.registrarEspectador(espectador1);
        mediador.registrarEspectador(espectador2);
        mediador.registrarEspectador(espectador3);

        meganman.seleccionarPoder(1);
        korby.seleccionarPoder(2);
        dittuu.seleccionarPoder(3);

        meganman.realizarAtaque(korby);
        korby.realizarDefensa(meganman);
        meganman.realizarAtaque(dittuu);

        while (korby.getVida() > 0) {
            meganman.realizarAtaque(korby);
        }
        while (dittuu.getVida() > 0) {
            meganman.realizarAtaque(dittuu);
        }

        espectador1.finalizarCombate(false);
        espectador2.finalizarCombate(true);  // Meganman gana
        espectador3.finalizarCombate(false);
    }

    /**
     * Simula un escenario de combate donde Dittuu es el ganador.
     * Se crean los personajes, los espectadores y se registran en el mediador.
     * Luego, se simula el combate hasta que Dittuu gana.
     *
     * @param mediador El mediador que gestiona las interacciones del combate.
     */
    public static void escenarioDittuuGana(MediadorCombate mediador) {
        // Crear personajes
        Personaje korby = new Korby(mediador);
        Personaje meganman = new Meganman(mediador);
        Personaje dittuu = new Dittuu(mediador);

        // Crear espectadores
        Espectador espectador1 = new Espectador("espectador1", "Korby");
        Espectador espectador2 = new Espectador("espectador2", "Meganman");
        Espectador espectador3 = new Espectador("espectador3", "Dittuu");

        // Registrar los espectadores en el mediador
        mediador.registrarEspectador(espectador1);
        mediador.registrarEspectador(espectador2);
        mediador.registrarEspectador(espectador3);

        dittuu.seleccionarPoder(1);
        korby.seleccionarPoder(2);
        meganman.seleccionarPoder(3);

        dittuu.realizarAtaque(korby);
        korby.realizarDefensa(dittuu);
        dittuu.realizarAtaque(meganman);

        while (korby.getVida() > 0) {
            dittuu.realizarAtaque(korby);
        }
        while (meganman.getVida() > 0) {
            dittuu.realizarAtaque(meganman);
        }

        espectador1.finalizarCombate(false);
        espectador2.finalizarCombate(false);
        espectador3.finalizarCombate(true);  // Dittuu gana
    }

    /**
     * Simula un combate aleatorio entre los personajes.
     * Los personajes se atacan entre sí hasta que solo queda uno con vida.
     * El combate es registrado por los espectadores, y el mediador gestiona las interacciones.
     *
     * @param mediador El mediador que gestiona las interacciones del combate.
     */
    public static void escenarioAleatorio(MediadorCombate mediador) {
        // Crear personajes y añadirlos a una lista
        List<Personaje> personajes = new ArrayList<>();
        Personaje korby = new Korby(mediador);
        Personaje meganman = new Meganman(mediador);
        Personaje dittuu = new Dittuu(mediador);
        personajes.add(korby);
        personajes.add(meganman);
        personajes.add(dittuu);

        // Crear espectadores
        Espectador espectador1 = new Espectador("espectador1", "Korby");
        Espectador espectador2 = new Espectador("espectador2", "Meganman");
        Espectador espectador3 = new Espectador("espectador3", "Dittuu");

        // Registrar los espectadores en el mediador
        mediador.registrarEspectador(espectador1);
        mediador.registrarEspectador(espectador2);
        mediador.registrarEspectador(espectador3);

        // Simular combate aleatorio
        korby.seleccionarPoder((int) (Math.random() * 3) + 1);
        meganman.seleccionarPoder((int) (Math.random() * 3) + 1);
        dittuu.seleccionarPoder((int) (Math.random() * 3) + 1);

        while (personajes.size() > 1) {
            int atacante = (int) (Math.random() * personajes.size());
            int atacado = (int) (Math.random() * personajes.size());

            Personaje atacantePresonaje = personajes.get(atacante);
            Personaje atacadoPersonaje = personajes.get(atacado);

            if(atacantePresonaje==atacadoPersonaje){
                atacantePresonaje.seleccionarPoder((int) (Math.random() * 3) + 1);
            } else {
                atacantePresonaje.realizarAtaque(atacadoPersonaje);
            }

            // Verificar si el atacado ha muerto y eliminarlo si es necesario
            Personaje PersonajeVerif = personajes.get(atacado);
            if (atacadoPersonaje.getVida() <= 0) {
                personajes.remove(atacadoPersonaje);
            }
        }

        // Evaluar resultados
        for (Personaje p : personajes) {
            if (p.getNombre().equals("Korby")) {
                espectador1.finalizarCombate(p.getVida() > 0);
            } else if (p.getNombre().equals("Meganman")) {
                espectador2.finalizarCombate(p.getVida() > 0);
            } else if (p.getNombre().equals("Dittuu")) {
                espectador3.finalizarCombate(p.getVida() > 0);
            }
        }
    }


}
