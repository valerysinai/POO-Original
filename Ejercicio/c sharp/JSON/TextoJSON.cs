using System;
using System.Text.Json;

class Ejemplo2 {
    static void Main() {
        var producto = new { id = 1, nombre = "Portátil", precio = 2500.5 };
        string json = JsonSerializer.Serialize(producto);
        Console.WriteLine("Objeto como texto JSON: " + json);
    }
}
