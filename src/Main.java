// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Leche(cafe); // Agregar Leche
        cafe = new Chocolate(cafe); // Agregar Chocolate

        System.out.println("Descripción: " + cafe.getDescripcion());
        System.out.println("Costo total: $" + cafe.getCosto());
    }
}

