using System;

class ContarUnos {
    static void Main() {
        string binario = "10101101";
        int contador = 0;

        foreach (char c in binario) {
            if (c == '1') contador++;
        }

        Console.WriteLine($"El número de unos en {binario} es: {contador}");
    }
}
