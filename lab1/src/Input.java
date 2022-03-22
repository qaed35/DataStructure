import java.util.Scanner;

/**
 * Created by admin on 10/01/2022.
 */
public class Input {
    public static void main(String[] args) {
       int a[]=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i=0; i<a.length;i++){
            a[i]=input.nextInt();}
        for (int i=0; i<a.length;i++) {
            System.out.println(a[i]);
        }
        }
    }

