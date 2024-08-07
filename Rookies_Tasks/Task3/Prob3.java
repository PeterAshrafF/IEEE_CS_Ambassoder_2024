import java.util.Scanner;

public class Prob3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] numbers = new long[n];
        long sum = 0;
        long minOdd = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
            sum += numbers[i];

            if (numbers[i] % 2 != 0) {
                minOdd = Math.min(minOdd, numbers[i]);
            }
        }
        scanner.close();

        if (sum % 2 != 0) {
            sum -= minOdd;
        }

        System.out.println(sum);
    }
}
