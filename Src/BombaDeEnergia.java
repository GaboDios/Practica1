public class BombaDeEnergia {

    @Override
    public void ejecutarAtaque(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha lanzado Bomba de Energia a " + objetivo.getNombre());
        objetivo.reducirVida(10);
    }

    @Override
    public void ejecutarDefensa(Personaje atacante, Personaje objetivo) {
        System.out.println(atacante.getNombre() + "Ha lanzado Bomba de Energia a " + objetivo.getNombre + " pero " + objetivo.getNombre + " la ha tomado y arrojado de regreso");
        atacante.reducirVida(10);
    }
    
}
