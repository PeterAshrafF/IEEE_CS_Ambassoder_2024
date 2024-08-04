import java.util.Scanner;
import java.util.HashSet;

public class prob2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        HashSet<Integer> asphaltedHorizontal = new HashSet<>();
        HashSet<Integer> asphaltedVertical = new HashSet<>();

        int[][] schedule = new int[n * n][2];
        for (int i = 0; i < n * n; i++) {
            schedule[i][0] = scanner.nextInt();
            schedule[i][1] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n * n; i++) {
            int h = schedule[i][0];
            int v = schedule[i][1];

            if (!asphaltedHorizontal.contains(h) && !asphaltedVertical.contains(v)) {
                asphaltedHorizontal.add(h);
                asphaltedVertical.add(v);
                result.append((i + 1)).append(" ");
            }
        }

        System.out.println(result.toString().trim());

        scanner.close();
    }
}