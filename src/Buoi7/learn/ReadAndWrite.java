package Buoi7.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/learn/score.txt");
        try(PrintWriter printWriter = new PrintWriter(file)){
            printWriter.print("Nguyen van A ");
            printWriter.println(9);
            printWriter.print("Nguyen van b ");
            printWriter.println(8);
        }
        try(Scanner sc = new Scanner(file)){
           /* while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }*/
            System.out.println(sc.next() +   sc.next() + " " + sc.next() + " " + sc.nextInt() +" "+
                    sc.next() +   sc.next() + " " + sc.next() + " " + sc.nextInt() +" " );

        }

    }
}
