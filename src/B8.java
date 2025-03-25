import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Map<Integer, String> num = new HashMap<>();
        num.put(1,"I");
        num.put(2,"II");
        num.put(3,"III");
        num.put(4,"IV");
        num.put(5,"V");
        num.put(6,"VI");
        num.put(7,"VII");
        num.put(8,"VIII");
        num.put(9,"IX");
        num.put(10,"X");
        num.put(11,"XI");
        num.put(12,"XII");
        num.put(13,"XIII");
        System.out.println("Nhap so: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1 && n <= 13) {
            System.out.println(num.get(n));
        }
    }
}
