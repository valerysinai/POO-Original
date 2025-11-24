abstract class Dispositivo {
    String marca;

    // Constructor sin parámetros
    public Dispositivo() {
        marca = "NA";
    }
 // Constructor con parámetros
    public Dispositivo(String marca) {
        this.marca = marca;
    }
    // Constructor copia
    public Dispositivo(Dispositivo d) {
        this.marca = d.marca;
    }
}
