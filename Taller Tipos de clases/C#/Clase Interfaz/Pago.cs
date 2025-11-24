interface IPago
{
    bool Procesar(double monto);
}

class PayPal : IPago
{
    public string Cuenta;

    public PayPal()
    {
        Cuenta = "NA";
    }

    public PayPal(string cuenta)
    {
        Cuenta = cuenta;
    }

    public PayPal(PayPal p)
    {
        Cuenta = p.Cuenta;
    }

    public bool Procesar(double monto)
    {
        return true;
    }
}

