import org.json.JSONArray;
import org.json.JSONObject;

public class ArregloJSON {
    public static void main(String[] args) {
        JSONArray estudiantes = new JSONArray();

        estudiantes.put(new JSONObject().put("nombre", "Ana").put("nota", 4.5));
        estudiantes.put(new JSONObject().put("nombre", "Luis").put("nota", 3.8));
        estudiantes.put(new JSONObject().put("nombre", "Valery").put("nota", 5.0));

        for (int i = 0; i < estudiantes.length(); i++) {
            JSONObject e = estudiantes.getJSONObject(i);
            System.out.println(e.getString("nombre") + " tiene una nota de " + e.getDouble("nota"));
        }
    }
}
