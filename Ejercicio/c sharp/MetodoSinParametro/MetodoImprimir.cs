using System;

class MetodoImprimir {
    static void MostrarFecha() {
        Console.WriteLine("La fecha de hoy es: " + DateTime.Now.ToShortDateString());
    }

    static void Main() {
        MostrarFecha();
    }
}
