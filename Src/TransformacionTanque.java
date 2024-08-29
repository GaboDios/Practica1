public class TransformacionTanque implements Strategy{

   
    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Se ha convertido en Tanque y ha lanzado un proyectil a " + objetivo.getNombre() + " causando un gran daño." + "\n La vida del " + objetivo.getNombre() + "es: " + objetivo.getVida());
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Se ha convertido en Tanque y ha lanzado un proyectil a " + objetivo.getNombre() + " pero " + objetivo.getNombre() + " ha defendido absorbiendo el impacto");
    }
    
}
