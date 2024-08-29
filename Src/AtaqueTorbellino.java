public class AtaqueTorbellino implements Strategy {
    
       @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con AtaqueTorbellino."
			   + "\n La vida del " + objetivo.getNombre() + "es: " + objetivo.getVida());
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con Ataque Torbellinopero " + objetivo.getNombre() + " ha defendido");
    }

}
