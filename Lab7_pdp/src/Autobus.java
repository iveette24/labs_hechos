
public class Autobus extends Vehicle {
    private static final int NRODES = 4;
    private int places;

    public Autobus(String matricula, int places) {
        // Volem un métode de la classe pare
        super(matricula, NRODES);
        this.places = places;
    }

}
