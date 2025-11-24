class Producto {
    String nombre;
    double precio;

    public Producto() {
        nombre = "Undefined";
        precio = 0.0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 10.0;
    }

    public Producto(Producto p) {
        this.nombre = p.nombre;
        this.precio = p.precio;
    }
}
