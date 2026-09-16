import java.util.Map;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        Map<String, String> programs = new HashMap<>();
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");

        for (Map.Entry e : programs.entrySet()) {
            System.out.print(e.getKey() + " ");
        }

        programs.remove("BSIT");

        if (programs.containsKey("BSCpE")) {
            System.out.println("Map contains key BSCpE");
        } else {
            System.out.println("Map does not contain key BSCpE");
        }
    }
}