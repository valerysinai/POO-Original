class Estudiante
{
    public string Id;
    public int Semestre;

    public Estudiante()
    {
        Id = "000";
        Semestre = 1;
    }

    public Estudiante(string id, int semestre)
    {
        Id = id;
        Semestre = semestre;
    }

    public Estudiante(string id)
    {
        Id = id;
        Semestre = 1;
    }

    public Estudiante(Estudiante e)
    {
        Id = e.Id;
        Semestre = e.Semestre;
    }
}
