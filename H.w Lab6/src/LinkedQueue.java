import java.util.Stack;

public class LinkedStack <E> extends Stack<E> {
    SinglyLIinkedList<E>list=new SinglyLIinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.removeFIRST();
    }


    public E top() {
        return list.first();
    }
}