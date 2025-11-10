using System;   

class Producto {
    public double precio = 45.99;
}

class AtributoPrecio {
    static void Main() {
        Producto p = new Producto();
        Console.WriteLine("Precio: $" + p.precio);
    }
}
