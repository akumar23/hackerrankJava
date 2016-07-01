package java_intro;
import java.io.*;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String ans = " ";
	        String[] rev = A.split("");
	        String[] org = A.split("");
	        for(int i = 0; i < rev.length / 2; i++){
	            String temp = rev[i];
	            rev[i] = rev[rev.length - i - 1];
	            rev[rev.length - i - 1] = temp;
	        }
	        for(int j = 0; j<rev.length; j++){
	            if(rev[j].charAt(0) == org[j].charAt(0)){
	                ans = "Yes";
	            }
	            else{
	            	ans = "No";
	            	break;
	            }
	        }
	        System.out.println(ans); 
	        }
	        

	}

