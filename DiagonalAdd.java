/**
 * Created by akumar on 7/5/16.
 */
import java.io.*;
import java.util.*;
public class DiagonalAdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int y = row-1;
        int prim_diag = 0;
        int sec_diag = 0;
        int[][] multi = new int[row][row];
        for(int i=0; i<row;i++){
            for(int j=0; j<row;j++){
                multi[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<row;i++){
            prim_diag+=(multi[i][i]);
        }
        for(int i=0; i<row;i++){
            sec_diag += multi[i][y];
            y--;
        }
        System.out.println(Math.abs(prim_diag-sec_diag));
    }
}
