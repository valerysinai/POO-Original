using System;

class DecimalABinario {
    static void Main() {
        int numero = 25;
        string binario = Convert.ToString(numero, 2);
        Console.WriteLine($"El número {numero} en binario es: {binario}");
    }
}
