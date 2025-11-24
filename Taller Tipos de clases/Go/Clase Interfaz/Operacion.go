interface Operacion {
    int ejecutar(int a, int b);
}

class Suma implements Operacion {
    int base;

    public Suma() {
        base = 0;
    }

    public Suma(int base) {
        this.base = base;
    }

    public Suma(Suma s) {
        this.base = s.base;
    }

    public int ejecutar(int a, int b) {
        return a + b + base;
    }
}

