package Buoi7.learn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileClass {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("Nguyễn văn A ");
        printWriter.println(8);
        printWriter.print("Nguyen Van B ");
        printWriter.println(9);
        printWriter.close();
       /* Scanner sc = new Scanner("Hello every body. how are you ?");
        sc.useDelimiter("[.]+");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }*/

        Scanner sc2 =  new Scanner(file);
        while (sc2.hasNext()){
            System.out.println(
                    sc2.next() + " " + sc2.next() + " " + sc2.next()  + " " + sc2.nextInt() +"\n"
                  + sc2.next() + " " + sc2.next() + " " + sc2.next()  + " " + sc2.nextInt()+"\n");

        }

    }
}
