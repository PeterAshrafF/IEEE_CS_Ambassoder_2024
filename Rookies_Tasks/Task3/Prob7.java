import java.util.Scanner;

public class Prob7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        boolean isRated = false;
        boolean isUnrated = false;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            if (a[i] != b[i]) {
                isRated = true;
            }
        }
        scanner.close();

        if (isRated) {
            System.out.println("rated");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                isUnrated = true;
                break;
            }
        }

        if (isUnrated) {
            System.out.println("unrated");
        } else {
            System.out.println("maybe");
        }
    }
}
