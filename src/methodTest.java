import java.util.Scanner;
public class methodTest {
    public static void main(String[] args) {
        outer: while(true) {
                    System.out.println("\t Enter number 1: ");
                    Scanner input = new Scanner(System.in);
                    double n1 = input.nextDouble();
                    System.out.println("\t Enter number 2: ");
                    double n2 = input.nextDouble();
                    System.out.println("\t Enter number 3: ");
                    double n3 = input.nextDouble();
                    System.out.println("\t The smallest number is:  " + getNumber(n1, n2, n3));
                    try {
                        Thread.sleep(1000);
                    }catch(InterruptedException e){System.out.println(e);}
                    System.out.println("If you want exit from program please enter 0:  \n");
                    int exitCode = input.nextInt();
                    switch (exitCode) {
                        case 0:
                            break outer;
                        default:
                            continue outer;
                    }
            }
    }
    public  static double getNumber(double n1, double n2, double n3) {
        return  Math.min(Math.min(n1, n2), n3);
    }
}