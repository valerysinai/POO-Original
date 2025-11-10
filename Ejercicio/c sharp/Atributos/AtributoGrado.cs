using System;

class Estudiante {
    public char grado = 'A';
}

class AtributoGrado {
    static void Main() {
        Estudiante e = new Estudiante();
        Console.WriteLine("Grado: " + e.grado);
    }
}
