using System;

class MetodoCalcular {
    static double AreaRectangulo(double baseR, double altura) {
        return baseR * altura;
    }

    static void Main() {
        double area = AreaRectangulo(5.5, 3.2);
        Console.WriteLine("Área del rectángulo: " + area);
    }
}
