using System;

class Persona {
    public int edad = 22;
}

class AtributoEdad {
    static void Main() {
        Persona p = new Persona();
        Console.WriteLine("Edad: " + p.edad + " años");
    }
}
