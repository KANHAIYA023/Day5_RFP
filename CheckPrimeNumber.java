package Com.Day5_RFP;
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number is: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("the number is prime");
        }
        else {
            System.out.println("the number is not prime");
        }
    }
}
