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
        int a = 0;
        String palindromSampleLowercase = palindromSample.toLowerCase();
        int lastCharacter = palindromSampleLowercase.length() - 1;
        for (int i =0; i <= lastCharacter/2; i++) {
            //System.out.println(palindromSampleLowercase.charAt(i));
            //System.out.println(i);
            if (palindromSampleLowercase.charAt(i) == palindromSampleLowercase.charAt(lastCharacter - i)) {
             a++;
            }
        }
        if (a >= lastCharacter/2) {
            System.out.println("Palindrom is ok ");
        } else {
            System.out.println("Palindrom is not ok !!!!");
        }
        return palindromSample;
    }
}
