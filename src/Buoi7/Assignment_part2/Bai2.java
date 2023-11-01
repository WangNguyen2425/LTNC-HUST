package Buoi7.Assignment_part2;

import java.io.*;
import java.util.Random;

public class Bai2 {
    public static void main(String[] args) throws IOException {
      boolean fileExists = fileExists("ACB.txt");
        FileWriter fileWriter = new FileWriter("ACB.txt",fileExists);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        Random random = new Random();
        for(int i = 0 ; i <150;i++){
            printWriter.print(random.nextInt());
            printWriter.print(" ");
        }
        fileWriter.close();

    }
    public static boolean fileExists(String fileName){
        File file = new File(fileName);
        return file.exists();
    }
}
