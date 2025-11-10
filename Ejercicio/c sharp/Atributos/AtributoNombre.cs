using System;

class Persona {
    public string nombre = "Valery";
}

class AtributoNombre {
    static void Main() {
        Persona p = new Persona();
        Console.WriteLine("Nombre: " + p.nombre);
    }
}
