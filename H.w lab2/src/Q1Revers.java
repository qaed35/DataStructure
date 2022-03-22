import java.util.Arrays;

/**
 * Created by admin on 26/01/2022.
 */
public class Q1Revers {
    public static int[] reverse(int [] y){
        int x=y.length-1;
        for (int i = 0; i <y.length/2 ; i++) {
            int t=y[i];
            y[i] = y[x];
            y[x]=t;
            x--;
        }
        return y ;
    }

    public static void main(String[] args) {
        int []r={1,2,3,4,5,6,7,8,9};
       System.out.println(Arrays.toString(r));
        System.out.println("the array after reverse");
        System.out.println(Arrays.toString(reverse(r)));
    }
    }

