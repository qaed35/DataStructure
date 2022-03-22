/**
 * Created by admin on 15/02/2022.
 */
public class LinkedList <C> {
    Node<C>head=null;
    Node<C>tail=null;
    int size=0;
    public LinkedList(){
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public C frist(){
        if (isEmpty())return null;
        return head.getNewelement();
    }
    public C last(){
        if (isEmpty())return null;
        return tail.getNewelement();
    }
    public void addfrist(C newelement){
        head=new Node<C>(newelement,head);
        if (size==0)
            tail=head;
         size++;
    }
    public void addlast(C newelement){
        Node<C> newest=new Node<C>(newelement,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        size++;
    }
    public C removefrist(){
        if (isEmpty())
            return null;
        C deleted=head.getNewelement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }

}
