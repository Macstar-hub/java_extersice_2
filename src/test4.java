import java.util.Scanner;

public class test4 {
    public static void main (String [] args) {
        System.out.println("this is forth project");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int n1 = input.nextInt();
        System.out.println("enter your second number");
        int n2 = input.nextInt();
        System.out.println("enter your third number");
        int n3 = input.nextInt();
        int n4 = (n1 + n2) % n3;
        System.out.format("result is: %d \n",n4);
        System.out.println("enter your name plz");
        Scanner stringsc = new Scanner(System.in);
        String str = stringsc.next();
        System.out.println("your name is: " + str);
    }
}
