import java.util.*;

public class B5 {
    public static void main(String[] args) {
        Map<String, Integer> prd = new HashMap<>();
        Map<String, Integer> newPrd = new HashMap<>();
        prd.put("apple", 1300);
        prd.put("banana", 3300);
        prd.put("cherry", 2250);
        prd.put("date", 1400);

        for( String p : prd.keySet() ){
            if(prd.get(p) >=500 && prd.get(p) <=1500){
                newPrd.put(p, prd.get(p));
            }
        }
        List<String> keys = new ArrayList<>(newPrd.keySet());
        int n = keys.size();
        System.out.println(newPrd);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String key1 = keys.get(i);
                String key2 = keys.get(j);
                if (newPrd.get(key1) > newPrd.get(key2)) {
                    Collections.swap(keys, i, j);
                }
            }
        }
        System.out.println(newPrd);
        System.out.println("Sau khi sắp xếp:");
        for (String key : keys) {
            System.out.println(key + " : " + newPrd.get(key));
        }
    }
}
