interface IOperacion
{
    int Ejecutar(int a, int b);
}

class Suma : IOperacion
{
    public int BaseValue;

    public Suma()
    {
        BaseValue = 0;
    }

    public Suma(int baseValue)
    {
        BaseValue = baseValue;
    }

    public Suma(Suma s)
    {
        BaseValue = s.BaseValue;
    }

    public int Ejecutar(int a, int b)
    {
        return a + b + BaseValue;
    }
}

