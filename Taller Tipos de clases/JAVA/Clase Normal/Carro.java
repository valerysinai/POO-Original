class Carro {

    String marca;
    int modelo;

    // Constructor sin parámetros
    public Carro() {
        marca = "NO";
        modelo = 0;
    }

    // Constructor con parámetros
    public Carro(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor sobrecargado
    public Carro(String marca) {
        this.marca = marca;
        this.modelo = 2025;
    }

    // Constructor copia
    public Carro(Carro c) {
        this.marca = c.marca;
        this.modelo = c.modelo;
    }
}
