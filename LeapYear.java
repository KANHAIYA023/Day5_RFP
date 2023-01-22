package Com.Day5_RFP;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year is: ");
        int yr = sc.nextInt();

        //leap year or not
        if (yr % 400 == 0) {
            System.out.println(yr + " is a Leap Year");
        }
        else if (yr % 4 == 0 && yr % 100 != 0) {
            System.out.println(yr + " is a Leap Year");
        }
        else {
            System.out.println(yr + " is not a Leap Year");
        }
    }
}
