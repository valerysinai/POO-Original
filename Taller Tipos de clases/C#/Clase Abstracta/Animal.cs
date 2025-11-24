abstract class Animal
{
    public string Nombre;

    public Animal()
    {
        Nombre = "Desconocido";
    }

    public Animal(string nombre)
    {
        Nombre = nombre;
    }

    public Animal(Animal a)
    {
        Nombre = a.Nombre;
    }

    public abstract void Sonido();
}


