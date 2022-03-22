import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 27/01/2022.
 */
public class Q3 {
    int y[];
    int element;

    public Q3() {
        y = new int[5];
        element = 0;
    }

    public int Addelement(int a) {

            y[element] = a;
            element++;

        return 0;

    }
    public int delete()
    {

            y[element - 1] =0;
            element--;

        return 0;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Q3 ad = new Q3();
        System.out.println("input the element");
        for (int i = 0; i < 5; i++) {
            if (ad.Addelement(input.nextInt()) ==0)
                System.out.println("added successfully");
            else
                System.out.println("array if full");
            System.out.println(Arrays.toString(ad.y));

        }
        for (int i = 0; i <7 ; i++) {
            if (ad.delete()==0)
                System.out.println("deleted successfully");
          else
                System.out.println("array is empty");
            System.out.println(Arrays.toString(ad.y));
       }


        }



    }


