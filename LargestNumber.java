package Com.Day5_RFP;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //find largest among three numbers
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("enter the number of a: ");
        a = sc.nextInt();
        System.out.print(" enter the number of b: ");
        b = sc.nextInt();
        System.out.print("enter the number of c: ");
        c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("largest number is a: " + a);
        }
        else if (b>a && b>c){
            System.out.println("largest number is b: " + b);
        }
        else if (c>a && c>b){
            System.out.println("largest number is c: " + c);
        }
        else {
            System.out.println("default value");
        }
    }
}
