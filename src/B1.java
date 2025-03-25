import java.util.HashMap;

public class B1 {
    public static void main(String[] args) {
        HashMap<String, Integer> sts = new HashMap<String, Integer>();
        sts.put("Nguyen Van A", 10);
        sts.put("Nguyen Van B", 9);
        sts.put("Nguyen Van C", 8);
        sts.put("Nguyen Van D", 7);
        String str = "Nguyen Van A";
        System.out.println("Student: " + str + ", Score: " + sts.get(str));
    }
}
