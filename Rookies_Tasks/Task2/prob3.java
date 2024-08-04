import java.util.Arrays;
import java.util.Scanner;

public class prob3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int mi = scanner.nextInt();
            int result = findShops(prices, mi);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int findShops(int[] prices, int mi) {
        int left = 0, right = prices.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (prices[mid] <= mi) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}