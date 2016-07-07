/**
 * Created by akumar on 7/6/16.
 */
import java.util.*;
public class Staircase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for(int i=0;i<row;i++){
           for(int j=row-1;j>i;j--){
               System.out.print(" ");
           }
            for(int k=0;k<(i+1);k++){
                System.out.print('#');
            }

            System.out.println(' ');
        }
    }
}
