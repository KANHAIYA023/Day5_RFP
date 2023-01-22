package Com.Day5_RFP;
import java.util.Random;
public class FlipCoin {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(2);
        System.out.print("get value is:" + x);
        if (x==1){
            System.out.println("- heads");
        }
        else{
            System.out.println("- tails");
        }
    }
}
