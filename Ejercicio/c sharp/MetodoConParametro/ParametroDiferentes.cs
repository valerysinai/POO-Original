using System;

class Ejemplo4 {
    static void MostrarInfo(string nombre, int edad, double altura) {
        Console.WriteLine($"{nombre} tiene {edad} años y mide {altura} metros.");
    }

    static void Main() {
        MostrarInfo("Valery", 22, 1.68);
    }
}
