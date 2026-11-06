
public class Turisme extends Vehicle {
    private static final int NRODES = 4;

    private double potencia;

    public Turisme(String matricula, double potencia) {
        super(matricula, NRODES);
        this.potencia = potencia;
    }

}
