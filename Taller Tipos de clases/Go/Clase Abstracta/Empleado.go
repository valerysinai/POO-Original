abstract class Empleado
{
    public string Id;

    public Empleado()
    {
        Id = "0";
    }

    public Empleado(string id)
    {
        Id = id;
    }

    public Empleado(Empleado e)
    {
        Id = e.Id;
    }

    public abstract double CalcularPago();
}
