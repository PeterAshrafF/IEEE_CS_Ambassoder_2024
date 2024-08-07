import java.util.Scanner;

public class Prob11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int testCase = 0; testCase < t; testCase++) {
            String cards = scanner.nextLine();

            // Possible (a, b) pairs where a * b = 12
            int[][] pairs = {
                    {1, 12}, {2, 6}, {3, 4}, {4, 3}, {6, 2}, {12, 1}
            };

            // Store valid pairs
            StringBuilder result = new StringBuilder();
            result.append("0");  // Default to 0 if no valid pairs are found

            for (int[] pair : pairs) {
                int a = pair[0];
                int b = pair[1];
                if (isWinningConfiguration(cards, a, b)) {
                    if (result.length() == 1) {
                        result.setLength(0);
                        result.append("0");
                    }
                    result.append(" ").append(a).append("x").append(b);
                }
            }

            // Update count if valid pairs were found
            if (result.length() > 1) {
                result.setCharAt(0, (char) (result.length() - 1 + '0'));
            }

            System.out.println(result);
        }

        scanner.close();
    }

    private static boolean isWinningConfiguration(String cards, int a, int b) {
        for (int col = 0; col < b; col++) {
            boolean allX = true;
            for (int row = 0; row < a; row++) {
                if (cards.charAt(row * b + col) != 'X') {
                    allX = false;
                    break;
                }
            }
            if (allX) {
                return true;
            }
        }
        return false;
    }
}
