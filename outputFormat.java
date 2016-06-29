/*
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each
integer will be in the inclusive range from to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using
exactly  characters.
The second column contains the integer, expressed in exactly  digits;
if the original input has less than three digits, you must pad your
output's leading digits with zeroes.
*/
package datatypes;
import java.util.Scanner;

public class outputFormat {
	public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                String s2 = Integer.toString(x);
	                if((s2.length()<3)&&(s2.length()>=2)){
	                    s2 = '0' + s2;
	                }else if(s2.length()<2){
	                    s2 = s2.concat("00");
	                }
	                System.out.print(s1);
	                for(int g=0;g<(15-s1.length());g++){
	                    System.out.print(" ");
	                }
	                System.out.print(s2);
	                System.out.println();
	            }
	            System.out.println("================================");

	    }
	}


