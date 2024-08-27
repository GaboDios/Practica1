public class AtaqueFuego implements Strategy {
    @Override
    public void ejecutarAtaque() {
        System.out.println("Ataque con fuego");
    }
    public void ejecutarDefensa(){
        System.out.println("Defensa contra fuego");
    }
    
}
