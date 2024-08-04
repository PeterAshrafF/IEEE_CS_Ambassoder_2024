import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Note if 12-hour format write 1 if the 24-hour format write 2");
        System.out.println("Please Enter 1 or 2 :");
        int t = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter time in format (HH:MM):");
        String time24 = scanner.nextLine();
        String[] parts = time24.split(":");
        int hour24 = Integer.parseInt(parts[0]);
        String minute = parts[1];

        int hour12;
        String period;
        if (hour24 < 12) {
            period = "AM";
            hour12 = (hour24 == 0) ? 12 : hour24;
        } else {
            period = "PM";
            hour12 = (hour24 == 12) ? 12 : hour24 - 12;
        }

        System.out.printf("your time is : %02d:%s %s\n", hour12, minute, period);

    }
}
