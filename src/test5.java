import java.util.Scanner;

public class test5 {
    public static void main (String[] args) {
        System.out.println("divdi two number:");
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int n1 = input.nextInt();
        System.out.println("enter second number");
        int n2 = input.nextInt();
        int n3 = n1/n2;
        System.out.format("resualt is: %d \n", n3 );
    }
}
