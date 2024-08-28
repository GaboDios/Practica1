import Src.Strategy;

public class AtaqueTorbellino implements Strategy {
       @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con AtaqueTorbellino.");
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre + " con Ataque Torbellinopero " + objetivo.getNombre + " ha defendido");
    }

}
