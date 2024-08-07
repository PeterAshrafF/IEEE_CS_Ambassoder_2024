import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the number of test cases:");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Please Enter the number of buckets for test case " + (i+1) + ":");
            int n = scanner.nextInt();

            long totalSquares = 0;
            for (int j = 0; j < n; j++) {
                System.out.println("Please Enter the number of squares in bucket " + (j+1) + ":");
                totalSquares += scanner.nextInt();
            }

            long sqrt = (long) Math.sqrt(totalSquares);
            if (sqrt * sqrt == totalSquares) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
