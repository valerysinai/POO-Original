public class MetodoCalcular {
    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        double area = areaRectangulo(5.5, 3.2);
        System.out.println("El área del rectángulo es: " + area);
    }
}
