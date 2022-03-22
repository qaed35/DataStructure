package Home_work_lab3;

/**
 * Created by admin on 20/02/2022.
 */
public class ArrayStack <C> implements Stack<C> {
    C data[];
    int t = -1 ;
    static final int CAPACITY = 100 ;

    public ArrayStack(int c) {

        data = (C[]) new Object[c] ;

    }

    public ArrayStack() {
        this(CAPACITY);
    }


    @Override
    public boolean isEmpty() {
        return t == -1 ;
    }

    @Override
    public int size() {
        return t + 1 ;
    }

    @Override
    public void push(C element) {

        if ( size() == data.length)
            throw new IllegalStateException("Stack is full") ;

        data[++t]= element ;


    }

    @Override
    public C pop() {

        if(isEmpty())
            return null ;

        C delete = data[t];
        data[t] = null ;
        t-- ;
        return delete ;


    }

    @Override
    public C top() {

        if(isEmpty()) return null ;

        return data[t] ;

    }


}
