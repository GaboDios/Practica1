import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected Strategy poder1;
    protected Strategy poder2;
    protected Strategy poder3;
    protected Strategy poderActual;
    
    // Lista de observadores
    private List<Observador> observadores = new ArrayList<>();

    public Personaje(String nombre, int vida, Strategy poder1, Strategy poder2, Strategy poder3) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.poderActual = poder1; // Por defecto selecciona el primer poder
    }

    // Método para agregar un observador
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Método para notificar a todos los observadores
    private void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

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

    public void realizarAtaque(Personaje objetivo) {
        if (poderActual != null) {
            poderActual.ejecutarAtaque(this, objetivo);
            notificarObservadores(nombre + " ha atacado a " + objetivo.getNombre());
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    public void realizarDefensa(Personaje atacante) {
        if (poderActual != null) {
            poderActual.ejecutarDefensa(atacante, this);
            notificarObservadores(nombre + " se ha defendido del ataque de " + atacante.getNombre());
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    public void reducirVida(int n) {
        this.vida -= n;
        notificarObservadores(nombre + " ha perdido " + n + " puntos de vida. Vida restante: " + vida);

        if (vida <= 0) {
            notificarObservadores(nombre + " ha muerto.");
        }
    }
}
