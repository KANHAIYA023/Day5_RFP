package Com.Day5_RFP;
import java.util.Scanner;
public class HarmonicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n number is: ");
        int n = sc.nextInt();
        double sum = 0;
        for ( int x = 1; x<=n; x++){
            sum = sum + 1.0/x;
        }
        System.out.println(sum);
    }

}
