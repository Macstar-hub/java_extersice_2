import java.util.Scanner;

public class palindromChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sample strings: ");
        String palindromSample = input.nextLine();
        System.out.println(palidromChecker(palindromSample));
    }

    public static String palidromChecker(String palindromSample) {
        System.out.println("text is:" + palindromSample);
        int lastCharacter = palindromSample.length() - 1;
        System.out.println("First character is: " + palindromSample.charAt(0));
        System.out.println("Last character is: " + palindromSample.charAt(lastCharacter));
        if (palindromSample.charAt(lastCharacter) == palindromSample.charAt(0)) {
            System.out.println("Result is true");
        } else {
            System.out.println("Result is false");
        }
        return palindromSample;
    }
}
