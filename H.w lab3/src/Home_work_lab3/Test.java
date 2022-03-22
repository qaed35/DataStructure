package Home_work_lab3;

import java.util.Scanner;

/**
 * Created by admin on 20/02/2022.
 */
public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> mystack = new ArrayStack<>(5) ;

        Scanner in = new Scanner(System.in);
        System.out.println("is the stack empty ? " + mystack.isEmpty());
        System.out.println("input elements");

        for (int i = 0 ; i < 5 ; i++) {
            mystack.push(in.nextInt());   // first will increcement top by 1 and save the element in that top .
            //System.out.println(mystack.t); // here to see the top what came
            System.out.println("top element is "+mystack.top());  // will return the element you entered
            System.out.println("stack size is = "+mystack.size()); // will increcement top by 1 next the push method
            System.out.println("is the stack empty ? "+mystack.isEmpty()); // will be false because top became 1 after incre in push and size methods

        }

        for (int i = 0 ; i < 6 ; i++) {
            System.out.println("deleted element is = "+mystack.pop()); //will return the deleted element ( the last one get in)
            System.out.println("top element after delete is = "+mystack.top());
            System.out.println("stack size is = "+mystack.size());
            System.out.println("is the stack empty ? "+mystack.isEmpty());

        }
    }
}
