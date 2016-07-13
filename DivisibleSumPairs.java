/**
 * Created by akumar on 7/12/16.
 */
import java.util.*;
public class DivisibleSumPairs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int validPair = 0;
        int n = s.nextInt();
        int k = s.nextInt();
        int [] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = s.nextInt();
        }
        for(int i= 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i < j){
                    if((intArray[i]+intArray[j])%k == 0){
                        validPair++;
                    }
                }

            }
        }
        System.out.println(validPair);
    }
}
