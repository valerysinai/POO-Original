class Libro
{
    public string Titulo;
    public string Autor;

    public Libro()
    {
        Titulo = "Desconocido";
        Autor = "NA";
    }

    public Libro(string titulo, string autor)
    {
        Titulo = titulo;
        Autor = autor;
    }

    public Libro(string titulo)
    {
        Titulo = titulo;
        Autor = "Autor genérico";
    }

    public Libro(Libro l)
    {
        Titulo = l.Titulo;
        Autor = l.Autor;
    }
}

