public class Dittuu extends Personaje {

    public Dittuu() {
        super("Dittuu", 100, new AtaqueFuego(), new AtaqueTorbellino(), new CanonDeHielo());
    }

    @Override
    public String getNombre() {
        return "Dittuu";
    }
}

