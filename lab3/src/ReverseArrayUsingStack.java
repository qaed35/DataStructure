import java.util.Arrays;

/**
 * Created by admin on 24/01/2022.
 */
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        ArrayStack<Integer> s = new ArrayStack<Integer>(5);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <5; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <5; i++) {
            a[i] = s.pop();
        }
        System.out.println("after reverse using Stack");
        System.out.println(Arrays.toString(a));
    }}
