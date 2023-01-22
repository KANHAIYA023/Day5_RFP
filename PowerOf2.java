package Com.Day5_RFP;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n number is: ");
        int n = sc.nextInt();

        for (int x=0; x<=n; x++ ){
            double powerOf = Math.pow(2,x);

            System.out.println(powerOf);
        }
    }

}
