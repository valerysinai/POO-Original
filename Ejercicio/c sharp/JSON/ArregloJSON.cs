using System;
using System.Collections.Generic;
using System.Text.Json;

class Estudiante {
    public string nombre { get; set; }
    public double nota { get; set; }
}

class Ejemplo4 {
    static void Main() {
        var estudiantes = new List<Estudiante> {
            new Estudiante { nombre = "Ana", nota = 4.5 },
            new Estudiante { nombre = "Luis", nota = 3.8 },
            new Estudiante { nombre = "Valery", nota = 5.0 }
        };

        foreach (var e in estudiantes)
            Console.WriteLine($"{e.nombre} tiene una nota de {e.nota}");
    }
}
