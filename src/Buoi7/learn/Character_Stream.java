package Buoi7.learn;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Character_Stream  {
        public static void main(String[] args) {
            String inputFile = "/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/learn/input.txt";
            String outputFile = "/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/learn/output.txt";

            try {
                // Ghi dữ liệu vào tệp tin với Character Stream
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                writer.write("Hello, world!");
                writer.newLine();
                writer.write("This is a text file.");
                writer.close();

                // Đọc dữ liệu từ tệp tin với Character Stream
                BufferedReader reader = new BufferedReader(new FileReader(outputFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


