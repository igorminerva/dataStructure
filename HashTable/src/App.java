import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Smarius");
        table.put("123", "Fablu");
        table.put("206", "Cooty");
        table.put("312", "Samaria");
        table.put("400", "Miclonei");
        table.put("587", "Ioshy");
        table.put("849", "Miari");

        

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() %10+ "\t"+key + "\t" + table.get(key));
        }
        
    }
}
