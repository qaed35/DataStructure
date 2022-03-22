/**
 * Created by admin on 15/02/2022.
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        System.out.println(list.size);
        list.addfrist(10);
        list.addlast(20);
        list.addfrist(15);
        list.removefrist();
        System.out.println(list.size);
        while (!list.isEmpty())
            System.out.println(list.removefrist());
    }
}
