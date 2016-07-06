/**
 * Created by akumar on 7/6/16.
 */
import java.util.*;
public class PlusMinus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        double zero_count = 0;
        double pos_count = 0;
        double neg_count = 0;
        int[] array = new int[amount];
        for(int i=0; i<amount;i++){
            array[i] = scan.nextInt();
            if(array[i]==0){
                zero_count = zero_count + 1;
            } else if(array[i]>0){
                pos_count = pos_count + 1;
            } else if(array[i]<0){
                neg_count = neg_count + 1;
            }
        }
        System.out.println(pos_count/amount);
        System.out.println(neg_count/amount);
        System.out.println(zero_count/amount);
    }

}
