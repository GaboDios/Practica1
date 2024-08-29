public class Korby extends Personaje {

    public Korby() {
        super("Korby", 100, new AtaqueFuego(), new AtaqueTorbellino(), new CanonDeHielo());
    }

    @Override
    public String getNombre() {
        return "Korby";
    }
}
