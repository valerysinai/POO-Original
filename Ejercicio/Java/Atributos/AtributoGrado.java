class Estudiante {
    char grado = 'A';
}

public class AtributoGrado {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        System.out.println("Grado: " + e.grado);
    }
}
