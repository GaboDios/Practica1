public class Korby extends Personaje {

    public Korby() {
        super("Korby", 100, new AtaqueFuego(), new AtaqueTorbellino(), new CañonDeHielo());
    }

    @Override
    public String getNombre() {
        return "Korby";
    }
}
