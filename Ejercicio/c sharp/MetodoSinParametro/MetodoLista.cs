using System;

class MetodoLista {
    static void MostrarColores() {
        string[] colores = { "Rojo", "Verde", "Azul" };
        foreach (string color in colores) {
            Console.WriteLine(color);
        }
    }

    static void Main() {
        MostrarColores();
    }
}
