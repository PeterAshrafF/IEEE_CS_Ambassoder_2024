import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the string (not actually used in the logic)
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the newline after the integer input

        // Read the string
        String input = scanner.nextLine();
        scanner.close();

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Use a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the string and add characters to the set
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                uniqueChars.add(ch);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        if (uniqueChars.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
