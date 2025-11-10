import java.time.LocalDate;

public class MetodoImprimir {
    static void mostrarFecha() {
        System.out.println("La fecha de hoy es: " + LocalDate.now());
    }

    public static void main(String[] args) {
        mostrarFecha();
    }
}
