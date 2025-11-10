public class ContarUnos {
    public static void main(String[] args) {
        String binario = "10101101";
        int contador = 0;

        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                contador++;
            }
        }

        System.out.println("El número de unos en " + binario + " es: " + contador);
    }
}
