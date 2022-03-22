import java.util.Scanner;

/**
 * Created by admin on 10/01/2022.
 */
public class Manegment1 {
    public static void main(String[] args) {
        Student[]team=new Student[3];
        Scanner in =new Scanner(System.in);
        for (int i=0; i<team.length;i++){
            Student s=new Student(in.nextInt(),in.next());
                    team[i]=s;}
        for (int i=0;i<team.length;i++){
            System.out.println(team[i].toString());
        }

    }
}
