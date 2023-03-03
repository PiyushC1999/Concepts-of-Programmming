import java.util.HashMap;
import java.util.Map;

public class MapExample {
public static void main(String[] args) {
    Map<String,Integer> data = new HashMap<> ();
    data.put("Piyush", 24);
    data.put("Neha", 22);
    data.put("Vaishali", 52);

    System.out.println(data.get("Piyush"));
    System.out.println(data.containsKey("Vaibhav"));

}
}
