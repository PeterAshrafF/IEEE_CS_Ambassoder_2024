import java.util.Scanner;

public class prob1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        char[][] cake = new char[r][c];
        for (int i = 0; i < r; i++) {
            cake[i] = scanner.nextLine().toCharArray();
        }

        boolean[] rowHasStrawberry = new boolean[r];
        boolean[] colHasStrawberry = new boolean[c];

        // Identify rows and columns that contain evil strawberries
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (cake[i][j] == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }

        int maxEatenCells = 0;

        // Count all cells in rows without strawberries
        for (int i = 0; i < r; i++) {
            if (!rowHasStrawberry[i]) {
                maxEatenCells += c;
            }
        }

        // Count all cells in columns without strawberries, excluding already counted cells
        for (int j = 0; j < c; j++) {
            if (!colHasStrawberry[j]) {
                for (int i = 0; i < r; i++) {
                    if (rowHasStrawberry[i]) {
                        maxEatenCells++;
                    }
                }
            }
        }

        System.out.println(maxEatenCells);

        scanner.close();
    }
}
