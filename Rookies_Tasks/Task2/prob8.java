import java.util.Scanner;

public class prob8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of rides Ann has planned
        int m = scanner.nextInt(); // number of rides covered by the m ride ticket
        int a = scanner.nextInt(); // price of a one ride ticket
        int b = scanner.nextInt(); // price of an m ride ticket

        // Cost if buying all rides with single-ride tickets
        int cost1 = n * a;

        // Cost if using multi-ride tickets and then single-ride tickets for the remainder
        int fullTickets = n / m;
        int remainingRides = n % m;
        int cost2 = (fullTickets * b) + (remainingRides * a);

        // Cost if using multi-ride tickets including one extra multi-ride ticket
        int cost3 = (fullTickets + 1) * b;

        // Determine the minimum cost
        int minimumCost = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(minimumCost);

        scanner.close();
    }
}
