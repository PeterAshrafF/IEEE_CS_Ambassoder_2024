public class Problem_3 {
    public static void main(String[] args) {
    int[] arr = {10, 15, 6, 40, 0, 60, 4};
    int target =80;
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            System.out.println("your number is at index: " + i);
            found = true;
            break;
        }
        else{
            found = false;
        }
    }
    if (!found) {
        System.out.println("your number is not in the array");
    }
}
}
