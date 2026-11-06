
public class Camio extends Vehicle {
    private static final int NRODES = 8;
    double pes;

    public Camio(String matricula, double pes) {
        super(matricula, NRODES);
        this.pes = pes;

    }

}
