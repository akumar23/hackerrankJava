/**
 * Created by akumar on 7/16/16.
 */
import java.util.*;
public class TimeInWords {
    public static String getMinute(int min){
        String[] minutes = {"ten","twenty"};
        String[] units = {"one","two","three","four","five","six","seven","eight","nine"};
        String[] ten_units = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        if(min%10 == 0){
            return minutes[(min/10)-1];
        } else if((min < 20)&&(min>10)){
          return ten_units[(min%10)-1];
        }else if(min<10){
            return units[min-1];
        } else {
            return minutes[(min/10)-1] +" "+ units[(min%10)-1];
        }
    }
    public static String getHour(int hour){
        String[] hours = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve"};
        return hours[(hour-1)];
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minutes = s.nextInt();
        if(minutes<30){
            if(minutes == 0){
                System.out.println(getHour(hour)+" o' clock");
            }else if(minutes == 15){
                System.out.println("quarter past "+ getHour(hour));
            } else{
                System.out.println(getMinute(minutes)+" minutes past "+getHour(hour));
            }

        } else if(minutes == 30){
            System.out.println("half past "+ getHour(hour));
        } else if((60-minutes)==15){
            System.out.println("quarter to "+ getHour(hour+1));
        } else {
            System.out.println(getMinute(60-minutes)+" minutes to "+getHour(hour+1));
        }
    }
}
