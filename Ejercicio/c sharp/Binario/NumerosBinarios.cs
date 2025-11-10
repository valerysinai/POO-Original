using System;

class SumarBinarios {
    static void Main() {
        string b1 = "1010";
        string b2 = "110";

        int n1 = Convert.ToInt32(b1, 2);
        int n2 = Convert.ToInt32(b2, 2);
        int suma = n1 + n2;

        string resultado = Convert.ToString(suma, 2);
        Console.WriteLine($"Suma de {b1} + {b2} = {resultado}");
    }
}
