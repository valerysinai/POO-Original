using System;

class CalcularCuadrado {
    static void Main() {
        int num = 4;
        int cuadrado = num * num;
        int cubo = num * num * num;

        Console.WriteLine("El cuadrado de " + num + " es: " + cuadrado);
        Console.WriteLine("El cubo de " + num + " es: " + cubo);
    }
}
