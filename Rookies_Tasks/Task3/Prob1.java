import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder feelings = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                feelings.append("I hate");
            } else {
                feelings.append("I love");
            }
            if (i != n) {
                feelings.append(" that ");
            }
        }

        feelings.append(" it");
        System.out.println(feelings.toString());
    }
}
