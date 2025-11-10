import org.json.JSONArray;
import org.json.JSONObject;

public class BuscarJSON {
    public static void main(String[] args) {
        JSONArray usuarios = new JSONArray();
        usuarios.put(new JSONObject().put("id", 1).put("usuario", "valery").put("activo", true));
        usuarios.put(new JSONObject().put("id", 2).put("usuario", "andres").put("activo", false));
        usuarios.put(new JSONObject().put("id", 3).put("usuario", "maria").put("activo", true));

        for (int i = 0; i < usuarios.length(); i++) {
            JSONObject u = usuarios.getJSONObject(i);
            if (u.getBoolean("activo")) {
                System.out.println("Primer usuario activo: " + u.getString("usuario"));
                break;
            }
        }
    }
}
