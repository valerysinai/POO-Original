using System;
using System.Collections.Generic;
using System.Linq;

class Usuario {
    public int id { get; set; }
    public string usuario { get; set; }
    public bool activo { get; set; }
}

class Ejemplo5 {
    static void Main() {
        var usuarios = new List<Usuario> {
            new Usuario { id = 1, usuario = "valery", activo = true },
            new Usuario { id = 2, usuario = "andres", activo = false },
            new Usuario { id = 3, usuario = "maria", activo = true }
        };

        var activo = usuarios.FirstOrDefault(u => u.activo);
        Console.WriteLine($"Primer usuario activo: {activo.usuario}");
    }
}
