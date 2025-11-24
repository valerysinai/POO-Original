interface IVehiculo
{
    void Encender();
}

class Moto : IVehiculo
{
    public string Modelo;

    public Moto()
    {
        Modelo = "NA";
    }

    public Moto(string modelo)
    {
        Modelo = modelo;
    }

    public Moto(Moto m)
    {
        Modelo = m.Modelo;
    }

    public void Encender() { }
}

