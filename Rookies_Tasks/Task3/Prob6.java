import java.util.Scanner;

public class Prob6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneRow = 0;
        int oneCol = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = scanner.nextInt();
                if (value == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }
        scanner.close();

        int moves = Math.abs(oneRow - 2) + Math.abs(oneCol - 2);

        System.out.println(moves);
    }
}
