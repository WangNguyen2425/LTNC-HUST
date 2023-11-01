package Buoi7.learn;

import java.io.*;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
            try(
                    BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("temp.txt"))
                    ){
                // output values to the file ( ghi dữ liệu ra file)
                for(int  i = 1 ; i <=100;i++){
                    output.write(i);
                }
            }
            // đọc ra màn hình
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("temp.txt"))) {
                    int value ;
                    while ((value = input.read()) !=-1){
                        System.out.print(value + " ");
                    }
            }
    }
}
