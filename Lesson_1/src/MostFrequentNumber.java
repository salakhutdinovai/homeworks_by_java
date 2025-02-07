import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> countMap = new HashMap<>();

        int mostFrequent = 0;
        int maxCount = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }

            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        System.out.println("Число, которое встречается чаще всего: " + mostFrequent);
    }
}

