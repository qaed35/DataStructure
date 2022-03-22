import java.util.Scanner;

/**
 * Created by admin on 24/01/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack= new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("input element");
        for (int i=0; i<5;i++){
            myStack.push(in.nextInt());
            System.out.println("top element ="+myStack.top());
            System.out.println("size ="+myStack.size());
            System.out.println("is the stack empty?"+ myStack.isEmpty());
        }
        for (int i=0; i<6;i++){
            myStack.pop();
            System.out.println("delet elemen`1t ="+myStack.pop());
            System.out.println("top element after delete ="+myStack.top());
            System.out.println("size ="+myStack.size());
            System.out.println("is the stack empty?"+ myStack.isEmpty());
        }
    }
}
