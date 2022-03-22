import java.util.Scanner;

/**
 * Created by LAB on 3/2/2022.
 */
public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice = -1;
        System.out.println("1 add first");
        System.out.println("2 add last");
        System.out.println("3 remove first");
        System.out.println("4 remove last");
        System.out.println("0 exit");
        while (choice!=0){
            System.out.println("what is your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input ur name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input ur name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println(list.removeFirst()+" remove ");


                    break;
                case 4:
                    System.out.println(list.removeLast()+" remove");

                    break;
                case 0:
                 System.exit(0);
                    break;

            }
            System.out.println("first = " + list.first() + " Last = " + list.last() + " Size = " + list.size() );

        }
    }
}
