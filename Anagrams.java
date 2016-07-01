package java_intro;
import java.io.*;
import java.util.*;

public class Anagrams {
	static void sortAnagram(String a, String b){
		
	}
    static boolean isAnagram(String a, String b) {
    	//char[] a2 = a.toCharArray();
    	//char[] b2 = b.toCharArray();
    	StringBuilder a2 = new StringBuilder(a);
    	StringBuilder b2 = new StringBuilder(b);
    	
    	boolean sol = false;
        for(int i = 0; i<a.length(); i++){
        	for(int j = 0; j<b.length(); j++){
        		if(Character.toLowerCase(a2.charAt(i))==Character.toLowerCase(b2.charAt(j))){
        			sol = true;
        			try{
        			b2.setCharAt(j,(Character)'\0');
        			} catch (NullPointerException e){
        			}
        			
        			break;
        		} else {
        			sol = false;
        		}
        	}
        	if(sol == false){
        		return sol;
        	}
        
        }
        System.out.println(b.length());
        if(b.length()!=0){
        	sol = false;
        }
        return sol;
        
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
