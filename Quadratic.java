package Com.Day5_RFP;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("value of a is: ");
        a = sc.nextInt();
        System.out.print("value of b is: ");
        b = sc.nextInt();
        System.out.print("value of c is: ");
        c = sc.nextInt();
        double delta = Math.sqrt(b*b - 4*a*c);

        double x1 = (-b + (delta))/(2*a);
        double x2 = (-b - (delta))/(2*a);

        System.out.println("root 1 of x: " + x1);
        System.out.println("root 2 of x: " + x2);

    }
}
