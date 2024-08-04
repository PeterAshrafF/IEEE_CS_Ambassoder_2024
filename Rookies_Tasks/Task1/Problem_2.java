import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        boolean isPalindrome=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String string1 = scanner.nextLine();
        System.out.println("You entered: " + string1);
        string1=string1.toLowerCase();
        string1=string1.replace(" ","");
        string1=string1.replace(",","");
        string1=string1.replace(":","");
        System.out.println("String1 : "+string1);

        int detector=string1.length()-1;
        for(int i=0;i<detector;i++){
            if(string1.charAt(i)==string1.charAt(detector)){
                isPalindrome=true;
                break;
            }
            if (string1.charAt(i) !=detector) {
                isPalindrome = false;
                break;
            }
            detector--;
        }

        if(isPalindrome){
            System.out.println("The string IS a palindrome");
        }
        else{
            System.out.println("The string IS NOT a palindrome");
        }
    }
}
