import java.util.HashMap;
import java.util.Map;

public class B2 {
    public static void main(String[] args) {
        Map<String, Float> lap = new HashMap<>();
        lap.put("Lap 1", 1000.0F);
        lap.put("Lap 2", 1000.0F);
        lap.put("Lap 3", 120.0F);
        lap.put("Lap 4", 130.0F);
        lap.put("Lap 5", 140.0F);
        boolean isExist = false;
        for (String l : lap.keySet() ){
            if(lap.get(l) == 1000.0F) {
                System.out.println("Lap " + l + " is 1000.0");
                isExist = true;
            }
        }
        if(!isExist) {
            System.out.println("Ko co lap nao = 1000.0");
        }

    }
}
