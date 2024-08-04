import java.util.Scanner;

public class prob7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Determine the number of prime numbers
        int numberOfPrimes;
        if (n % 2 == 0) {
            numberOfPrimes = n / 2;
        } else {
            numberOfPrimes = (n - 3) / 2 + 1;
        }

        System.out.println(numberOfPrimes);

        // Output the primes
        if (n % 2 == 0) {
            for (int i = 0; i < numberOfPrimes; i++) {
                System.out.print("2 ");
            }
        } else {
            for (int i = 0; i < numberOfPrimes - 1; i++) {
                System.out.print("2 ");
            }
            System.out.print("3");
        }

        scanner.close();
    }
}
