abstract class Figura
{
    public string Color;

    public Figura()
    {
        Color = "Negro";
    }

    public Figura(string color)
    {
        Color = color;
    }

    public Figura(Figura f)
    {
        Color = f.Color;
    }

    public abstract double Area();
}

