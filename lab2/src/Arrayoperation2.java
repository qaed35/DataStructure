import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by admin on 25/01/2022.
 */
public class Arrayoperation2 {
    int x[];
    int numOfElemnets;

    public Arrayoperation2() {
        x=new int [5];
        numOfElemnets=0;
    }
    public int  add (int e){
        if (numOfElemnets<x.length)
        {
            x[numOfElemnets]=e;
            numOfElemnets++;
            return 0;
        }
        return -1;
    }

    public int  addSortedElement (int e){
        if (numOfElemnets<x.length)
        {//insertion sort
            int i=numOfElemnets;
            while (i>0&& e<x[i-1])
            {
                x[i] = x[i-1];
                i--;
            }
            x[i]=e;
            numOfElemnets++;
            return 0;
        }
        return -1;
    }

    public int delete()
    {
        if(numOfElemnets>0)
        {
            x[numOfElemnets-1]=-1;
            numOfElemnets--;
            return 0;
        }
        return -1;
    }

    public int deleteSortedElement(int index){
        if (numOfElemnets>0&& index>0){
            int i=index;
            while(i<numOfElemnets-1)
            {
                x[i]=x[i+1];
                i++;
            }
            x[i]=-1;
            numOfElemnets--;
            return 0;}
        return -1;
    }
    public static void main(String[] args) {
        Arrayoperation2 test= new Arrayoperation2();
        Scanner in = new Scanner(System.in);
        System.out.println("input elements");
//        for (int i = 0; i <7 ; i++) {
//            if (test.add(in.nextInt())==0)
//                System.out.println("added successfully");
//            else
//                System.out.println("array if full");
//            System.out.println(Arrays.toString(test.x));
//        }
        for (int i = 0; i <7 ; i++) {
            if (test.addSortedElement(in.nextInt())==0)
                System.out.println("added successfully");
            else
                System.out.println("array if full");
            System.out.println(Arrays.toString(test.x));
        }
//        for (int i = 0; i <7 ; i++) {
//            if (test.delete()==0)
//                System.out.println("deleted successfully");
//            else
//                System.out.println("array is empty");
//            System.out.println(Arrays.toString(test.x));
//        }

        for (int i = 0; i <4 ; i++) {
            if (test.deleteSortedElement(i)==0)
                System.out.println("deleted successfully");
            else
                System.out.println("array is empty");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
