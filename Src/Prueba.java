import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        // Crear mediador
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

        // Apagar el mediador (opcional, dependiendo de si se reutiliza en otra parte)
        mediador.shutdown();
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("===== Menú de Escenarios de Combate =====");
        System.out.println("1. Escenario: Korby Gana");
        System.out.println("2. Escenario: Meganman Gana");
        System.out.println("3. Escenario: Dittuu Gana");
        System.out.println("4. Escenario: Combate Aleatorio");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

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


        // Simular combate donde Korby gana
        korby.seleccionarPoder(1);  // Poder fuerte
        meganman.seleccionarPoder(2);
        dittuu.seleccionarPoder(3);

        korby.realizarAtaque(meganman);  // Korby ataca a Meganman
        meganman.realizarDefensa(korby); // Meganman defiende
        korby.realizarAtaque(dittuu);    // Korby ataca a Dittuu

        // Forzar los resultados para asegurarnos de que Korby gane
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


        // Simular combate donde Meganman gana
        meganman.seleccionarPoder(1);  // Poder fuerte
        korby.seleccionarPoder(2);
        dittuu.seleccionarPoder(3);

        meganman.realizarAtaque(korby); // Meganman ataca a Korby
        korby.realizarDefensa(meganman); // Korby defiende
        meganman.realizarAtaque(dittuu); // Meganman ataca a Dittuu

        // Forzar los resultados para asegurarnos de que Meganman gane
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


        // Simular combate donde Dittuu gana
        dittuu.seleccionarPoder(1);  // Poder fuerte
        korby.seleccionarPoder(2);
        meganman.seleccionarPoder(3);

        dittuu.realizarAtaque(korby); // Dittuu ataca a Korby
        korby.realizarDefensa(dittuu); // Korby defiende
        dittuu.realizarAtaque(meganman); // Dittuu ataca a Meganman

        // Forzar los resultados para asegurarnos de que Dittuu gane
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
            int atacante = (int) (Math.random() * 3);
            int atacado = (int) (Math.random() * 3);


            switch (atacante) {
                case 0:
                    if (atacado ==0) {
                        korby.seleccionarPoder((int) (Math.random() * 3) + 1);
                    }else if (atacado == 1) {
                            korby.realizarAtaque(meganman);
                        } else if (atacado == 2) {
                            korby.realizarAtaque(dittuu);
                        }
                    break;
                case 1:
                    if (atacado == 0) {
                        meganman.realizarAtaque(korby);
                    } else if (atacado == 1) {
                        meganman.seleccionarPoder((int) (Math.random() * 3) + 1);
                    }else if  (atacado == 2) {
                        meganman.realizarAtaque(dittuu);
                    }
                    break;
                case 2:
                    if (atacado == 0) {
                        dittuu.realizarAtaque(korby);
                    } else if (atacado == 1) {
                        dittuu.realizarAtaque(meganman);
                    } else if (atacado == 2) {
                        dittuu.seleccionarPoder((int) (Math.random() * 3) + 1);
                    }
                    break;
            }

            // Verificar si el atacado ha muerto y eliminarlo si es necesario
            Personaje atacadoPersonaje = personajes.get(atacado);
            if (atacadoPersonaje.getVida() <= 0) {
                personajes.remove(atacadoPersonaje);
                mediador.notificar(atacadoPersonaje.getNombre(), atacadoPersonaje.getNombre() + " ha sido eliminado del combate.");
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
