public class BinarioPalindromo {
    public static void main(String[] args) {
        String binario = "10101";
        String invertido = new StringBuilder(binario).reverse().toString();

        if (binario.equals(invertido)) {
            System.out.println("El número binario " + binario + " es palíndromo.");
        } else {
            System.out.println("El número binario " + binario + " no es palíndromo.");
        }
    }
}
