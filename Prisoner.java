/**
 * Created by akumar on 7/6/16.
 */
import java.util.*;
public class Prisoner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i< T ; i++){
            int N = scan.nextInt();
            int M = scan.nextInt();
            int S = scan.nextInt();
            int warn = (S-1)+M;
            while(warn>N)
                warn = warn - N;
            System.out.println(warn);

        }

    }
}
