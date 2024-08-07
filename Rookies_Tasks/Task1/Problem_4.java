import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int Num = scanner.nextInt();
        String[][] arr = new String[Num*2][Num*2];

        // Fill the array
        for (int i = 0; i < Num * 2; i++) {
            for (int j = 0; j < Num * 2; j++) {
                if ((i ^ j) % 2 == 0) {
                    arr[i][j] = "..";
                } else {
                    arr[i][j] = "##";
                }
            }
        }

        // Print the array
        for (int i = 0; i < Num * 2; i++) {
            for (int j = 0; j < Num * 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
