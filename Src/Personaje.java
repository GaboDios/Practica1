import java.util.ArrayList;
import java.util.List;

/**
 * La clase abstracta {@code Personaje} representa un personaje en un juego con habilidades de ataque y defensa.
 * Cada personaje tiene un nombre, una cantidad de vida y tres estrategias de poder. La clase también implementa
 * el patrón Observador, lo que permite notificar a observadores registrados sobre cambios en el estado del personaje.
 */
public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected Strategy poder1;
    protected Strategy poder2;
    protected Strategy poder3;
    protected Strategy poderActual;
    
    // Lista de observadores
    private List<Observador> observadores = new ArrayList<>();

    /**
     * Constructor para inicializar un personaje con su nombre, vida y tres estrategias de poder.
     *
     * @param nombre El nombre del personaje.
     * @param vida La cantidad inicial de vida del personaje.
     * @param poder1 La primera estrategia de poder.
     * @param poder2 La segunda estrategia de poder.
     * @param poder3 La tercera estrategia de poder.
     */
    public Personaje(String nombre, int vida, Strategy poder1, Strategy poder2, Strategy poder3) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.poderActual = poder1; // Por defecto selecciona el primer poder
    }

    /**
     * Agrega un observador a la lista de observadores del personaje.
     *
     * @param observador El observador que se añadirá a la lista.
     */
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    /**
     * Notifica a todos los observadores registrados sobre un evento o cambio en el estado del personaje.
     *
     * @param mensaje El mensaje que será enviado a los observadores.
     */
    private void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    /**
     * Obtiene la vida actual del personaje.
     *
     * @return La vida actual del personaje.
     */
    public int getVida() {
        return vida;
    }

    /**
     * Obtiene el nombre del personaje.
     *
     * @return El nombre del personaje.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite al personaje seleccionar uno de sus tres poderes para ser utilizado en el próximo ataque o defensa.
     *
     * @param numeroPoder El número del poder que se desea seleccionar (1, 2, o 3).
     */
    public void seleccionarPoder(int numeroPoder) {
        switch (numeroPoder) {
            case 1:
                poderActual = poder1;
                break;
            case 2:
                poderActual = poder2;
                break;
            case 3:
                poderActual = poder3;
                break;
            default:
                System.out.println("Poder no válido");
                break;
        }
        notificarObservadores(nombre + " ha seleccionado el poder " + poderActual.getClass().getSimpleName());
    }

    /**
     * Realiza un ataque usando el poder actualmente seleccionado contra otro personaje.
     *
     * @param objetivo El personaje que será atacado.
     */
    public void realizarAtaque(Personaje objetivo) {
        if (poderActual != null) {
            poderActual.ejecutarAtaque(this, objetivo);
            notificarObservadores(nombre + " ha atacado a " + objetivo.getNombre());
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    /**
     * Realiza una defensa usando el poder actualmente seleccionado contra un ataque recibido.
     *
     * @param atacante El personaje que realiza el ataque que será defendido.
     */
    public void realizarDefensa(Personaje atacante) {
        if (poderActual != null) {
            poderActual.ejecutarDefensa(atacante, this);
            notificarObservadores(nombre + " se ha defendido del ataque de " + atacante.getNombre());
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    /**
     * Reduce la vida del personaje en una cantidad especificada y notifica a los observadores.
     * Si la vida del personaje cae a 0 o menos, se notifica que el personaje ha muerto.
     *
     * @param n La cantidad de vida que se reducirá.
     */
    public void reducirVida(int n) {
        this.vida -= n;
        notificarObservadores(nombre + " ha perdido " + n + " puntos de vida. Vida restante: " + vida);

        if (vida <= 0) {
            notificarObservadores(nombre + " ha muerto.");
        }
    }
    /**
     * Retorna el nombre del poder actualmente seleccionado.
     *
     * @return El nombre de la clase que representa el poder actual.
     */
    public String getNombrePoderActual() {
        if (poderActual != null) {
            return poderActual.getClass().getSimpleName();
        } else {
            return "No hay poder seleccionado";
        }
    }
}
