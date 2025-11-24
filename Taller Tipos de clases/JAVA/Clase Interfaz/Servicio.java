interface Servicio {
    void activar();
}

class Wifi implements Servicio {
    String nombre;

    public Wifi() {
        nombre = "Sin nombre";
    }

    public Wifi(String nombre) {
        this.nombre = nombre;
    }

    public Wifi(Wifi w) {
        this.nombre = w.nombre;
    }

    @Override
    public void activar() {}
}

