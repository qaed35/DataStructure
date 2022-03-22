package Home_Work_lab4;

/**
 * Created by admin on 20/02/2022.
 */
public class ArrayQueue<C>implements Queue<C> {
    final static int capacity = 100 ;
    C[] data ;
    int sz = 0 ;   // هذا المتغيير يعطيك عدد العناصر الموجودة وليس له علاقة بالمواقع
    int f = 0 ;

    public ArrayQueue( int c) {
        data = (C[]) new Object[c] ;
    }

    public ArrayQueue() {
        this(capacity) ;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0 ;
    }

    @Override
    public int size() {
        return sz ;

    }

    @Override
    public void enqueue(C element) {

        if (size() == data.length)
            throw new IllegalStateException("Queue is full");

        int index = (f + sz) % data.length ;
        data[index] = element ;
        sz++ ;
    }

    @Override
    public C dequeue() {
        if (isEmpty()) return null ;

        C deleted = data[f] ;
        data[f] = null ;
        f = (f + 1) % data.length ; // تكون محصورة بين اول موقع واخر موقع
        sz--;
        return deleted ;
    }

    @Override
    public C first() {
        if ( isEmpty()) return null ;
        return data[f] ;
    }

}
