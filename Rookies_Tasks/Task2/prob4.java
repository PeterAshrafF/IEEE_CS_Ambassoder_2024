import java.util.Scanner;

public class prob4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate the final position
        int finalPosition = (a + b) % n;

        // Adjusting the position if it's negative or zero
        if (finalPosition <= 0) {
            finalPosition += n;
        }

        System.out.println(finalPosition);

        scanner.close();
    }
}