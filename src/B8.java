import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhập số nguyên dương N (1 - 3999): ");
            n = scanner.nextInt();
            if (n > 0 && n <= 3999) break;
            System.out.println("Vui lòng nhập số từ 1 đến 3999!");
        }

        String romanNumeral = convertToRoman(n);
        System.out.println("Số La Mã tương ứng: " + romanNumeral);

        scanner.close();
    }

    public static String convertToRoman(int num) {
        LinkedHashMap<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (num >= entry.getKey()) {
                roman.append(entry.getValue());
                num -= entry.getKey();
            }
        }
        return roman.toString();
    }
}
