/**
 * Created by akumar on 7/20/16.
 */
import java.util.*;
public class ThunderCloud {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cloud_num = s.nextInt();
        int total_num = 0;
        int[] clouds = new int[cloud_num];
        for(int i=0;i<cloud_num;i++){
            clouds[i] = s.nextInt();
        }
        for(int i=0;i<(cloud_num-3);i++){
            if(clouds[i+2]==0){
                total_num++;
                i++;
            } else if(clouds[i+1]==0){
                total_num++;
            }
        }
        System.out.println(total_num+1);
    }
}
