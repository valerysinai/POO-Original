using System;

class BinarioPalindromo {
    static void Main() {
        string binario = "10101";
        char[] arr = binario.ToCharArray();
        Array.Reverse(arr);
        string invertido = new string(arr);

        if (binario == invertido)
            Console.WriteLine($"El número binario {binario} es palíndromo.");
        else
            Console.WriteLine($"El número binario {binario} no es palíndromo.");
    }
}
