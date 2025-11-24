abstract class Animal {

    String nombre;

    // Constructor sin parámetros
    public Animal() {
        nombre = "Desconocido";
    }

    // Constructor con parámetros
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Constructor copia
    public Animal(Animal a) {
        this.nombre = a.nombre;
    }

    // Método abstracto
    abstract void sonido();
}
