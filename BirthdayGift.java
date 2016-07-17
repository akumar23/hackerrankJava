/**
 * Created by akumar on 7/16/16.
 */
import java.util.*;
public class BirthdayGift {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        for(int i=0;i<loop;i++){
            long blackGiftAmount = s.nextInt();
            long whiteGIftAmount = s.nextInt();
            long blackGift= s.nextInt();
            long whiteGift = s.nextInt();
            long convertCost = s.nextInt();
            long case1 = blackGiftAmount*blackGift+whiteGIftAmount*whiteGift;
            long case2 = blackGiftAmount*(whiteGift+convertCost)+whiteGIftAmount*whiteGift;
            long case3 = blackGiftAmount*blackGift+whiteGIftAmount*(blackGift+convertCost);
            if((convertCost>=whiteGift)&&(convertCost>=blackGift)){
                System.out.println(case1);
            } else {
                if((case1<case2)&&(case1<case3)){
                    System.out.println(case1);
                } else if((case2<case1 && (case2<case3))){
                    System.out.println(case2);
                } else if((case3<case1)&&(case3<case2)){
                    System.out.println(case3);
                } else{
                    System.out.println(case1);
                }
            }

        }
    }
}
