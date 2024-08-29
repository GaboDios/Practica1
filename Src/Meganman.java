public class Meganman extends Personaje {

    public Meganman() {
        super("Meganman", 100, new BombaDeEnergia(), new GolpeDeRoca(), new RayoElectrico());
    }

    @Override
    public String getNombre() {
        return "Meganman";
    }
}

