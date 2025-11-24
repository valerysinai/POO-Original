class Carro
{
    public string Marca;
    public int Modelo;

    public Carro()
    {
        Marca = "NA";
        Modelo = 0;
    }

    public Carro(string marca, int modelo)
    {
        Marca = marca;
        Modelo = modelo;
    }

    public Carro(string marca)
    {
        Marca = marca;
        Modelo = 2024;
    }

    public Carro(Carro c)
    {
        Marca = c.Marca;
        Modelo = c.Modelo;
    }
}

