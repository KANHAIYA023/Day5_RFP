package Com.Day5_RFP;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,var;
        System.out.print("enter the value of a:");
        a = sc.nextInt();
        System.out.print("enter the value of b: ");
        b = sc.nextInt();

        var = a;
        a = b;
        b = var;
        System.out.println("swap number is: " + a + " " + b);
    }
}
