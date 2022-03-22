import java.util.Scanner;

/**
 * Created by Arabic on 23/02/22.
 */
public class TestCircularList {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        CircularlyLinkedList<String>list= new CircularlyLinkedList<>();
        System.out.println("1 add first\t2 add last\t3 rotate\t4 removeFirst\t0 exit");
        int choice=-1;
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                   list.rotate();
                    break;
                case 4:
                    System.out.println("deleted is "+list.removeFirst());
                    break;
                case 0:
                    System.exit(0);



            }
            System.out.println("first= "+list.first()+"\t last= "+list.last()+"\t size= "+list.size());
        }
    }
}
