/**
 * Created by akumar on 7/23/16.
 */
import java.util.*;
public class CamelCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        /*int wordCount = 0;
        if(s.length()>0){
            for(int i=0;i<s.length();i++){
                if((s.toCharArray()[i]>=65)&&(s.toCharArray()[i]<=90)){
                    wordCount++;
                }
            }
            System.out.println(wordCount+1);
        } else{
            System.out.println(wordCount);
        }
    */
        System.out.println(s.length()-(s.replaceAll("[A-Z]","").length())+1);

    }
}
