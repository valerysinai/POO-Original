abstract class Empleado {

    String id;
    String nombre;

    // Constructor sin parámetros
    public Empleado() {
        id = "01";
        nombre = "Desconocido";
    }

    // Constructor con parámetros
    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Constructor sobrecargado (solo id)
    public Empleado(String id) {
        this.id = id;
        this.nombre = "Sin nombre";
    }

    // Constructor copia
    public Empleado(Empleado e) {
        this.id = e.id;
        this.nombre = e.nombre;
    }

    // Método abstracto
    abstract double calcularPago();
}
