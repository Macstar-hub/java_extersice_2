import java.util.Scanner;

public class palindromChecker {
    public static void main(String[] args) {
        outer:
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter sample strings: ");
            String palindromSample = input.nextLine();
            System.out.println(palidromChecker(palindromSample));
            System.out.println("\t *************** For exit press 0 and for continue press 1 : **********************");
            int exitStatus = input.nextInt();
            switch (exitStatus) {
                case 0:
                    break outer;
                case 1:
                    continue ;
            }
        }
    }
    public static String palidromChecker(String palindromSample) {
        //System.out.println("text is:" + palindromSample);
        String palindromSampleLowercase = palindromSample.toLowerCase();
        int lastCharacter = palindromSampleLowercase.length() - 1;
        //System.out.println("First character is: " + palindromSampleLowercase.charAt(0));
        //System.out.println("Last character is: " + palindromSampleLowercase.charAt(lastCharacter));
        if (palindromSampleLowercase.charAt(lastCharacter) == palindromSampleLowercase.charAt(0)) {
            System.out.println("Result is true");
        } else {
            System.out.println("Result is false");
        }
        return palindromSample;
    }
}
