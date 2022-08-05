import java.util.Scanner;

public class test3 {
    public static void main (String[] args) {
        System.out.println("this is third project that has divid sample");
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int n1 = input.nextInt();
        System.out.println("enter second number");
        int n2 = input.nextInt();
        int n3 = Math.floorDiv(n1, n2);
        System.out.format("result operation is: %d", n3);
    }
}
