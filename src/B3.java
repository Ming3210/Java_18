import java.util.LinkedHashMap;

public class B3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> prd = new LinkedHashMap<String, Integer>();
        prd.put("Apple", 10);
        prd.put("Banana", 20);
        prd.put("Cherry", 30);
        prd.put("Durian", 40);
        prd.put("Elderberry", 50);
        prd.replace("Apple", 10,20);
        for(String p : prd.keySet()){
            System.out.println(p + ": " + prd.get(p));
        }
        System.out.println("\n\n");
        prd.remove("Apple");
        for(String p : prd.keySet()){
            System.out.println(p + ": " + prd.get(p));
        }
    }
}
