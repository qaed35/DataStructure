package Home_work_lab3;

import java.util.Arrays;

/**
 * Created by admin on 20/02/2022.
 */
public class Reverse {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50} ;

        ArrayStack<Integer> s = new ArrayStack<>(x.length);
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {
            s.push(x[i]);

        }

        for (int i = 0; i < x.length; i++) {
            x[i] = s.pop() ;

        }

        System.out.println("after reverse using stack");
        System.out.println(Arrays.toString(x));
    }
    }

