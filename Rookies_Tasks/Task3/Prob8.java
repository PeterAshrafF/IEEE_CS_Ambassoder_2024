import java.util.Scanner;

public class Prob8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        scanner.close();

        int nextYear = y + 1;

        while (true) {
            if (hasDistinctDigits(nextYear)) {
                System.out.println(nextYear);
                break;
            }
            nextYear++;
        }
    }

    private static boolean hasDistinctDigits(int year) {
        String yearStr = Integer.toString(year);
        boolean[] seen = new boolean[10];

        for (char c : yearStr.toCharArray()) {
            int digit = c - '0';
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
        }

        return true;
    }
}
