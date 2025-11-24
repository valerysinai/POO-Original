interface INotificacion
{
    void Enviar(string msg);
}

class Email : INotificacion
{
    public string Correo;

    public Email()
    {
        Correo = "example@mail.com";
    }

    public Email(string correo)
    {
        Correo = correo;
    }

    public Email(Email e)
    {
        Correo = e.Correo;
    }

    public void Enviar(string msg) { }
}


