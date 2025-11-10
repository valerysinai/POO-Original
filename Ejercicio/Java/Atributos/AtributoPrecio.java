class Producto {
    double precio = 45.99;
}

public class AtributoPrecio {
    public static void main(String[] args) {
        Producto p = new Producto();
        System.out.println("Precio: $" + p.precio);
    }
}
