/**
 * Created by Arabic on 23/02/22.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E el);
    E dequeue();
}
