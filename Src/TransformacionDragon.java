public class TransformacionDragon implements Strategy {

     @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Se ha convertido en Dragon y ha escupido una bola de fuego a " + objetivo.getNombre() + " causando un gran daño." + "\n La vida del " + objetivo.getNombre() + "es: " + objetivo.getVida());
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "SE ha convertido en Dragon y ha escupido una bola de fuego a " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " ha defendido haciendose a un costado");
    }
    
}
