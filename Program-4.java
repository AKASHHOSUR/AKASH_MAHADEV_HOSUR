import java.util.*;

public class DivisibilityCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        Map<Integer, Integer> result = new LinkedHashMap<>(); // keeps order 1–9

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0) count++;
            }
            result.put(i, count);
        }

        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // remove last comma and space
        sb.append("}");
        
        System.out.println(sb.toString());
    }
}
