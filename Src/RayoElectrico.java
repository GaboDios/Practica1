public class RayoElectrico implements Strategy {

    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre() + " con Rayo Electrico.");
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha atacado a " + objetivo.getNombre + " con Rayo Electrico, pero " + objetivo.getNombre + " ha defendido");
    }

    
}
