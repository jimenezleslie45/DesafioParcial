public class Chocolate extends Decorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    public double getCosto() {
        return bebida.getCosto() + 0.7; // costo adicional por chocolate
    }
}