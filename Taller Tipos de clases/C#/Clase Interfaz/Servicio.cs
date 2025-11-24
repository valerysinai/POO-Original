interface IServicio
{
    void Activar();
}

class Wifi : IServicio
{
    public string Nombre;

    public Wifi()
    {
        Nombre = "Sin nombre";
    }

    public Wifi(string nombre)
    {
        Nombre = nombre;
    }

    public Wifi(Wifi w)
    {
        Nombre = w.Nombre;
    }

    public void Activar() { }
}


