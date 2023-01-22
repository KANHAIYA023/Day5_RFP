package Com.Day5_RFP;
import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the dividend is: ");
        int a = sc.nextInt();
        System.out.print("enter the divisor is: ");
        int b = sc.nextInt();

        int quotient = a/b;
        System.out.println("the quotient is: " + quotient);

        int remainder = a%b;
        System.out.println("the remainder is: " + remainder);
    }
}
