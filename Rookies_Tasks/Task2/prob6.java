import java.util.Scanner;

public class prob6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int last = a[n - 1];

        if (last == 15) {
            System.out.println("DOWN");
        } else if (last == 0) {
            System.out.println("UP");
        } else if (n == 1) {
            System.out.println("-1");
        } else {
            int secondLast = a[n - 2];
            if (last > secondLast) {
                System.out.println("UP");
            } else {
                System.out.println("DOWN");
            }
        }

        scanner.close();
    }
}
