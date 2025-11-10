import org.json.JSONObject;

public class TextoJSON {
    public static void main(String[] args) {
        String texto = "{\"nombre\":\"Carlos\",\"edad\":30,\"profesion\":\"Ingeniero\"}";
        JSONObject objeto = new JSONObject(texto);

        System.out.println("Nombre: " + objeto.getString("nombre"));
        System.out.println("Edad: " + objeto.getInt("edad"));
    }
}
