import java.util.Scanner;

public class Prob10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Interval of Ilia's calls
        int m = scanner.nextInt();  // Interval of artists' arrivals
        int z = scanner.nextInt();  // Duration of the day
        scanner.close();

        // Calculate the least common multiple (LCM) of n and m
        int lcm = lcm(n, m);

        // Count the number of multiples of lcm that are ≤ z
        int count = z / lcm;

        System.out.println(count);
    }

    // Function to compute the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute the least common multiple (LCM)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
