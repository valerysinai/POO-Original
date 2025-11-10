using System;
using System.Text.Json;

class Ejemplo1 {
    static void Main() {
        var persona = new { nombre = "Valery", edad = 22, ciudad = "Bogotá" };
        string json = JsonSerializer.Serialize(persona);
        Console.WriteLine(json);
    }
}
