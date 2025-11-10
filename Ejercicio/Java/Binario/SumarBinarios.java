public class SumarBinarios {
    public static void main(String[] args) {
        String b1 = "1010"; // 10 en decimal
        String b2 = "110";  // 6 en decimal

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int suma = n1 + n2;
        String resultado = Integer.toBinaryString(suma);

        System.out.println("Suma de " + b1 + " + " + b2 + " = " + resultado);
    }
}
