import java.util.TreeMap;

public class B4 {
    public static void main(String[] args) {
        TreeMap<String, Float> emp = new TreeMap<String, Float>();
        emp.put("NV001", 35000.0F);
        emp.put("NV003", 40000.0F);
        emp.put("NV002", 290000.0F);
        emp.put("NV004", 50000.0F);
        emp.put("NV123", 51000.0F);

        for(String e : emp.keySet()){
            System.out.println(e + " : " + emp.get(e));
        }

        emp.replace("NV123",10.0F);
        emp.remove("NV002");

        System.out.println("\n\n");
        for(String e : emp.keySet()){
            System.out.println(e + " : " + emp.get(e));
        }
    }
}
