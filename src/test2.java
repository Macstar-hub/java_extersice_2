import java.io.PrintStream;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        System.out.println("this is test2 extersice");
        Scanner  input = new Scanner(System.in);
        System.out.println("enter your first number");
        int n1 = input.nextInt();
        System.out.format("enter number is: %d \n", n1);
        System.out.println("enter your second number");
        int n2 = input.nextInt();
        System.out.format("enter number is: %d \n", n2);
        System.out.println("the sum of two number is ");
        int n3 = n1 - n2;
        System.out.format("the sum number is %d \n", n3);
    }

}

