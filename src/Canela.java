public class Canela extends Decorador {
    public Canela(Bebida bebida) {
        super(bebida);
        descripcion = bebida.getDescripcion() + ", Canela";
        costo = bebida.getCosto() + 0.3; // costo adicional por canela
    }

    public double getCosto() {
        return costo;
    }
}

