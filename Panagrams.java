/**
 * Created by akumar on 7/31/16.
 */
import java.util.*;
public class Panagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean[] alphabet = new boolean[26];
        s = s.toUpperCase().replaceAll("\\s", "");
        for (int i = 0; i < s.length(); i++) {
            if ((s.toCharArray()[i] >= 65) && (s.toCharArray()[i] <= 90)) {
                alphabet[s.toCharArray()[i] - 65] = true;
            }
        }
        for(int i=0;i<alphabet.length;i++){
            if(!alphabet[i]){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
