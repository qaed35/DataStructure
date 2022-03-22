package Home_work_lab3;

/**
 * Created by admin on 20/02/2022.
 */
public interface Stack <C> {
    boolean isEmpty() ;
    int size();
    void push (C element);
    C pop();
    C top();
}
