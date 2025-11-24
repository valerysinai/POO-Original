abstract class Dispositivo
{
    public string Marca;

    public Dispositivo()
    {
        Marca = "NA";
    }

    public Dispositivo(string marca)
    {
        Marca = marca;
    }

    public Dispositivo(Dispositivo d)
    {
        Marca = d.Marca;
    }
}
