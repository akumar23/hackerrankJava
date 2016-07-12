/**
 * Created by akumar on 7/12/16.
 */
import java.util.*;
public class LargeSum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum_num = s.nextInt();
        long total = 0;
        for(int i =0; i<sum_num;i++){
            total+=s.nextInt();
        }
        System.out.println(total);
    }
}
