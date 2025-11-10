using System;

class MetodoDevuelve {
    static int Multiplicar(int x, int y) {
        return x * y;
    }

    static void Main() {
        int resultado = Multiplicar(4, 6);
        Console.WriteLine("Resultado: " + resultado);
    }
}
