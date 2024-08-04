import java.util.*;

public class prob5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] ingredients = new int[n];
            for (int i = 0; i < n; i++) {
                ingredients[i] = scanner.nextInt();
            }

            Set<Integer> outside = new HashSet<>();
            int fridgeOpenings = 0;

            for (int i = 0; i < n; i++) {
                if (!outside.contains(ingredients[i])) {
                    fridgeOpenings++;
                    if (outside.size() == k) {
                        outside.clear();  // clear the set when it's full to make room for new ingredients
                    }
                    outside.add(ingredients[i]);
                }
            }

            System.out.println(fridgeOpenings);
        }

        scanner.close();
    }
}