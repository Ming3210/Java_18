import java.util.LinkedHashMap;

public class B6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> sts = new LinkedHashMap<String, Float>();
        sts.put("Nguyen Van A", 10F);
        sts.put("Nguyen Van B", 9.5F);
        sts.put("Nguyen Van C", 9F);
        sts.put("Nguyen Van D", 8.5F);
        sts.put("Nguyen Van E", 8F);
        sts.put("Nguyen Van F", 7.5F);
        sts.put("Nguyen Van G", 9F);
        sts.put("Nguyen Van H", 6.5F);
        sts.put("Nguyen Van I", 6.5F);
        sts.put("Nguyen Van J", 4.5F);

        for(String s : sts.keySet()){
            System.out.println(s + ": " + sts.get(s));
        }
        int sum = 0;
        for(String s : sts.keySet()){
            sum += sts.get(s);
        }
        System.out.println("Diem tb: " + (float)sum/sts.size());
        for(String s : sts.keySet()){
            if(sts.get(s) < 5){
                sts.remove(s);
            }
        }
        System.out.println("\n");
        for(String s : sts.keySet()){
            System.out.println(s + ": " + sts.get(s));
        }
    }
}
