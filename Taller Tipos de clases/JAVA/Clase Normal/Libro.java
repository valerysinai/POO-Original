class Libro {
    String titulo;
    String autor;

    public Libro() {
        titulo = "Desconocido";
        autor = "NA";
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Autor genérico";
    }

    public Libro(Libro l) {
        this.titulo = l.titulo;
        this.autor = l.autor;
    }
}
