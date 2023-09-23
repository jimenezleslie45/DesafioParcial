public class Leche extends Decorador {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double getCosto() {
        return bebida.getCosto() + 0.5; // costo adicional por leche
    }
}