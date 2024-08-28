public class TransformacionEspada implements Strategy{

    
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Se ha convertido en Espada y se ha lanzado como kamikaze contra " + objetivo.getNombre() + " causando un gran daño en el corazón.");
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Se ha convertido en Espada y se ha lanzado como kamikaze contra " + objetivo.getNombre + " pero " + objetivo.getNombre + " ha defendido esquivandolo");
    }
    
}
