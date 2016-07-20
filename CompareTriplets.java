/**
 * Created by akumar on 7/18/16.
 */
import java.util.*;
public class CompareTriplets {
    public static int loop = 3;
    public static void fillArray(int x[]){
        Scanner s = new Scanner(System.in);
        for(int i=0;i<loop;i++){
            x[i] = s.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[loop];
        int b[] = new int[loop];
        int a_score = 0;
        int b_score = 0;
        fillArray(a);
        fillArray(b);
        for(int i=0;i<loop;i++){
            if(a[i]>b[i]){
                a_score++;
            }else if(b[i]>a[i]){
                b_score++;
            }
        }
        System.out.print(a_score+" "+b_score);
        System.out.println(" ");
    }
}
