/**
 * Created by admin on 15/02/2022.
 */
public class Node <C>{
    private C newelement;
    private Node<C> next;
    public Node(C newelement,Node<C> next){
        this.newelement=newelement;
        this.next=next;
    }
    public C getNewelement(){
        return newelement;
    }
    public Node<C> getNext(){
        return next;
    }
    public void setNext(Node<C> next){
        this.next=next;
    }
}
