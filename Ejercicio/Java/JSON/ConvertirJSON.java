import org.json.JSONObject;

public class ConvertirJSON {
    public static void main(String[] args) {
        JSONObject producto = new JSONObject();
        producto.put("id", 1);
        producto.put("nombre", "Portátil");
        producto.put("precio", 2500.5);

        String jsonTexto = producto.toString();
        System.out.println("Objeto como texto JSON: " + jsonTexto);
    }
}
