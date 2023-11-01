package Buoi7.Assignment_part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        int line = 0;
        int word = 0;
        int charc = 0;
        try(BufferedReader output = new BufferedReader(new FileReader("/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/Assignment_part2/input.txt"))){
                String line2;
                while ((line2 = output.readLine()) != null){
                    line ++;
                    charc += line2.length();
                    String[] words = line2.split(" ");
                    word += words.length;
                }
        }
        System.out.println("line = " + line);
        System.out.println("so ki tu = " + charc);
        System.out.println("so tu = " + word);


    }
}
