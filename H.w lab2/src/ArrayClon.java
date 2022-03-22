/**
 * Created by admin on 26/01/2022.
 */
public class ArrayClon {
    public static void main(String args[])
    {
        int num_Array[] = {5,10,15,20,25,30};

        int clone_Array[] = num_Array.clone();

        System.out.println("Original num_Array:");
        for (int i = 0; i <num_Array.length; i++) {
            System.out.print(num_Array[i]+" ");
        }
        System.out.println();

        System.out.println("Cloned num_Array:");
        for (int i = 0; i <clone_Array.length; i++) {
            System.out.print(clone_Array[i]+" ");
        }
        System.out.println("\n");

        System.out.print("num_Array == clone_Array = ");
        System.out.println(num_Array == clone_Array);
    }
}
