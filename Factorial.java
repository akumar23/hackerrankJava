/**
 * Created by akumar on 7/16/16.
 */
import java.math.*;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BigInteger tot_fact = BigInteger.valueOf(1);
        int loop = s.nextInt();
        for(int i=1;i<=loop;i++) {
            tot_fact = tot_fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(tot_fact);
    }
}
