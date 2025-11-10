using System;

class Auto {
    public int velocidadMaxima = 180;
}

class AtributoVelocidad {
    static void Main() {
        Auto a = new Auto();
        Console.WriteLine("Velocidad Máxima: " + a.velocidadMaxima + " km/h");
    }
}
