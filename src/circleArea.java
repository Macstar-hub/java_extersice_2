import java.util.Scanner;

public class circleArea {
    public static void main (String[] args) {
        //System.out.println("Your area is: " + circleAreaCalc(3));
        for (int r=0 ; r <=10 ; r++ ){
            System.out.println("Radius is: " + r);
            System.out.println("And Area is:" + circleAreaCalc(r));
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){System.out.println(e);}
        }
    }
    static double circleAreaCalc(double r){
        double area = r * r * 3.14;
        return  area;
    }
}
