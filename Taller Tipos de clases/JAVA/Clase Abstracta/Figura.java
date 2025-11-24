abstract class Figura {

     String color;

    // Constructor sin parámetros
    public Figura() {
        color = "Negro";
    }

    // Constructor con parámetros
    public Figura(String color) {
        this.color = color;
    }

    // Constructor copia
    public Figura(Figura f) {
        this.color = f.color;
    }

    // Método abstracto
    abstract double area();
}
