package Home_Work_lab4;

/**
 * Created by admin on 20/02/2022.
 */
public interface Queue<C> {
    boolean isEmpty() ;
    int size () ;
    void enqueue (C element) ;
    C dequeue () ;
    C first () ;
}
