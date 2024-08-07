import java.util.Scanner;

public class Prob5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        int numberOfShovels = 1;
        while (true) {
            int totalCost = numberOfShovels * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                break;
            }
            numberOfShovels++;
        }

        System.out.println(numberOfShovels);
    }
}
