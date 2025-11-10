using System;

class BinarioADecimal {
    static void Main() {
        string binario = "11001";
        int decimalValue = Convert.ToInt32(binario, 2);
        Console.WriteLine($"El binario {binario} en decimal es: {decimalValue}");
    }
}
