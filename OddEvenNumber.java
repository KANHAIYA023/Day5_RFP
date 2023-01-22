package Com.Day5_RFP;
import java.util.Scanner;
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //check the number is odd or even
        System.out.print("enter the number is: ");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.print(number + " is Even number");
        }
        else {
            System.out.print(number + " is Odd number");
        }
    }
}
