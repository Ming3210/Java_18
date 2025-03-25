import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        System.out.println("Nhap n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ",i);
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int count = 1;
            if (map.containsKey(arr[i])) {
                continue;
            }
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }

            }
            map.put(arr[i], count);
        }
        System.out.println(map);
        for(int key : map.keySet()) {
            System.out.printf("%d : %d lan\n", key, map.get(key));
        }
    }
}
