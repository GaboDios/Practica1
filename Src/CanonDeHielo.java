public class CanonDeHielo implements Strategy{

     @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con Canon de Hielo.");
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con Canon de Hielo pero " + objetivo.getNombre() + " ha defendido");
    }

    
}
