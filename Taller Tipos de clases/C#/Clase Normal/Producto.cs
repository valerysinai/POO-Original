class Producto
{
    public string Nombre;
    public double Precio;

    public Producto()
    {
        Nombre = "Undefined";
        Precio = 0.0;
    }

    public Producto(string nombre, double precio)
    {
        Nombre = nombre;
        Precio = precio;
    }

    public Producto(string nombre)
    {
        Nombre = nombre;
        Precio = 10.0;
    }

    public Producto(Producto p)
    {
        Nombre = p.Nombre;
        Precio = p.Precio;
    }
}


