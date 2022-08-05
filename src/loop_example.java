import java.util.Scanner;

public class loop_example {
    public static int time_Global = 1000 ;
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter time: ");
        int time = input.nextInt();
        System.out.println("enter upper number: ");
        int upper_number = input.nextInt();
        for (int i=0; i <=upper_number; i++) {
            try {
                Thread.sleep(time);
            }
            catch(InterruptedException e){System.out.println(e);}
            System.out.println("i value is:" + i);
        }
    }

}

