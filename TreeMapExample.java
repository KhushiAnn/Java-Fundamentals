import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        System.out.println("=== TreeMap Example ===");
        TreeMap<String, Integer> tmap = new TreeMap<>();

        tmap.put("C", 3);
        tmap.put("A", 1);
        tmap.put("B", 2);

        System.out.println("Sorted TreeMap: " + tmap);
        System.out.println("First key: " + tmap.firstKey());
        System.out.println("Last key: " + tmap.lastKey() + "\n");
    }
}
