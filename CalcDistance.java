package Com.Day5_RFP;
import java.util.Scanner;

public class CalcDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.print("enter the value of x: ");
        x = sc.nextInt();
        System.out.print("enter the value of y: ");
        y = sc.nextInt();

        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance is: " + distance);

    }

}
