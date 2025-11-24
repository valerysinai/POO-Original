interface Pago {
    boolean procesar(double monto);
}

class PayPal implements Pago {
    String cuenta;

    public PayPal() {
        cuenta = "NA";
    }

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
    }

    public PayPal(PayPal p) {
        this.cuenta = p.cuenta;
    }

    @Override
    public boolean procesar(double monto) {
        return true;
    }
}

