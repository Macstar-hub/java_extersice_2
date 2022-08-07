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
        String palindromSampleLowercase = palindromSample.toLowerCase();
        int lastCharacter = palindromSampleLowercase.length() - 1;
        System.out.println("First character is: " + palindromSampleLowercase.charAt(0));
        System.out.println("Last character is: " + palindromSampleLowercase.charAt(lastCharacter));
        if (palindromSampleLowercase.charAt(lastCharacter) == palindromSampleLowercase.charAt(0)) {
            System.out.println("Result is true");
        } else {
            System.out.println("Result is false");
        }
        return palindromSample;
    }
}
