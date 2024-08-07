import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] socks = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            socks[i] = scanner.nextInt();
        }
        scanner.close();

        Set<Integer> table = new HashSet<>();
        int maxSocksOnTable = 0;

        for (int sock : socks) {
            if (table.contains(sock)) {
                // Pair found, remove both from the table
                table.remove(sock);
            } else {
                // Add sock to the table
                table.add(sock);
                // Update the maximum number of socks on the table
                maxSocksOnTable = Math.max(maxSocksOnTable, table.size());
            }
        }

        System.out.println(maxSocksOnTable);
    }
}
