/**
 * Created by akumar on 7/5/16.
 */
import java.io.*;
import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int loop = scan.nextInt();
        int[] intArray = new int[loop];
        for(int i =0; i<loop;i++){
            intArray[i] = scan.nextInt();
            sum = sum + intArray[i];
        }
        System.out.println(sum);
    }
}
