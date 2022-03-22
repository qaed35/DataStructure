/**
 * Created by Arabic on 23/02/22.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E el);
    E pop();
}
