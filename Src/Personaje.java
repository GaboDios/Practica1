public abstract class Personaje {
    protected String nombre;
    protected static int vida;
    protected Strategy poder1;
    protected Strategy poder2;
    protected Strategy poder3;
    protected Strategy poderActual;

    public Personaje(String nombre, int vida, Strategy poder1, Strategy poder2, Strategy poder3){
        this.nombre = nombre;
        this.vida = 100;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.poderActual = poder1;
    }

    public static int getVida(){
        return vida;
    }

    public String getNombre(){
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
    }

    public void realizarAtaque(Personaje objetivo) {
        if (poderActual != null) {
            poderActual.ejecutarAtaque(this, objetivo);
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    public void realizarDefensa(Personaje atacante) {
        if (poderActual != null) {
            poderActual.ejecutarDefensa(atacante, this);
        } else {
            System.out.println("No se ha seleccionado un poder");
        }
    }

    public void reducirVida(int n){
        this.vida = vida -n;
    }
}
