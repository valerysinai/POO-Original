import org.json.JSONObject;

public class MostrarJSON {
    public static void main(String[] args) {
        JSONObject persona = new JSONObject();
        persona.put("nombre", "Valery");
        persona.put("edad", 22);
        persona.put("ciudad", "Bogotá");

        System.out.println(persona);
        System.out.println("Nombre: " + persona.getString("nombre"));
    }
}
