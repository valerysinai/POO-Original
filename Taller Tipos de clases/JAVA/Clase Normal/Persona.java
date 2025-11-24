class Persona {
    String nombre;
    int edad;

    // Constructor sin parámetros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor sobrecargado
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
    }

    // Constructor copia
    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
    }
}

