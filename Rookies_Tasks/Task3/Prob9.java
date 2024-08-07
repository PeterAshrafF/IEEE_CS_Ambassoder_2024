import java.util.Scanner;
import java.util.Arrays;

public class Prob9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] banknotes = new int[n];

        for (int i = 0; i < n; i++) {
            banknotes[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(banknotes);

        // If the smallest banknote is greater than 1, then 1 is an unfortunate sum.
        if (banknotes[0] > 1) {
            System.out.println(1);
            return;
        }

        // Find the minimum unfortunate sum using the concept of "gaps" between possible sums
        int maxPossible = 1000000;  // A large number to limit the range
        boolean[] canForm = new boolean[maxPossible + 1];
        canForm[0] = true;  // Base case: 0 can be formed with no banknotes

        for (int i = 0; i < banknotes.length; i++) {
            for (int j = banknotes[i]; j <= maxPossible; j++) {
                if (canForm[j - banknotes[i]]) {
                    canForm[j] = true;
                }
            }
        }

        for (int i = 1; i <= maxPossible; i++) {
            if (!canForm[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
