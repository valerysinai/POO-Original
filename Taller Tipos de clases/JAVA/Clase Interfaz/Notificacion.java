interface Notificacion {
    void enviar(String msg);
}

class Email implements Notificacion {
    String correo;

    public Email() {
        correo = "example@mail.com";
    }

    public Email(String correo) {
        this.correo = correo;
    }

    public Email(Email e) {
        this.correo = e.correo;
    }

    public void enviar(String msg) {}
}

