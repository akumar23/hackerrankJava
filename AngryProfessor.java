/**
 * Created by akumar on 7/11/16.
 */
import java.util.*;
public class AngryProfessor {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        for(int i =0; i<loop; i++){
            int students_on_time = 0;
            int student_num = s.nextInt();
            int student_expected = s.nextInt();
            for(int j=0; j<student_num;j++){
                int student_time = s.nextInt();
                if(student_time<=0){
                    students_on_time++;
                }
            }
            if(students_on_time>=student_expected){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
