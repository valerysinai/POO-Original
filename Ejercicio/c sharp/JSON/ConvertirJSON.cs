using System;
using System.Text.Json;

class Persona {
    public string nombre { get; set; }
    public int edad { get; set; }
    public string profesion { get; set; }
}

class Ejemplo3 {
    static void Main() {
        string texto = "{\"nombre\":\"Carlos\",\"edad\":30,\"profesion\":\"Ingeniero\"}";
        Persona p = JsonSerializer.Deserialize<Persona>(texto);
        Console.WriteLine($"Nombre: {p.nombre}, Edad: {p.edad}");
    }
}
