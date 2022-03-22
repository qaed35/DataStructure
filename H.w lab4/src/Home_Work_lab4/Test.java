package Home_Work_lab4;

import java.util.Scanner;

/**
 * Created by admin on 20/02/2022.
 */
public class Test {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5) ;

        System.out.println("is the queue empty ? " + queue.isEmpty());
        System.out.println("input queue element ");
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++) {
            queue.enqueue(in.nextInt());
            System.out.println("first = "+ queue.first());
            System.out.println("size = "+ queue.size());
        }

        while (! queue.isEmpty()) {
            System.out.print(queue.dequeue() + "\t");

        }
    }
}
