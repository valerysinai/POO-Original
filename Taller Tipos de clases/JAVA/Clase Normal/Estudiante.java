class Estudiante {
    String id;
    int semestre;

    public Estudiante() {
        id = "000";
        semestre = 1;
    }

    public Estudiante(String id, int semestre) {
        this.id = id;
        this.semestre = semestre;
    }

    public Estudiante(String id) {
        this.id = id;
        this.semestre = 1;
    }

    public Estudiante(Estudiante e) {
        this.id = e.id;
        this.semestre = e.semestre;
    }
}
