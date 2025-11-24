interface Vehiculo {
    void encender();
}

class Moto implements Vehiculo {
    String modelo;

    public Moto() {
        modelo = "NA";
    }

    public Moto(String modelo) {
        this.modelo = modelo;
    }

    public Moto(Moto m) {
        this.modelo = m.modelo;
    }

    @Override
    public void encender() {}
}

