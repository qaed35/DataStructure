package Home_Work_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by admin on 20/02/2022.
 */
public class PrintFile {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayQueue<String> filestoprint = new ArrayQueue<>(1);

        System.out.println("input files names to print");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 1 ; i++) {
            filestoprint.enqueue(in.next());

        }

        System.out.println("print files in queue");
        while (!filestoprint.isEmpty()) {

            Scanner filescan = new Scanner(new File(filestoprint.dequeue()));
            while (filescan.hasNextLine()) {
                System.out.println(filescan.nextLine());
            }
        }




    }
}
