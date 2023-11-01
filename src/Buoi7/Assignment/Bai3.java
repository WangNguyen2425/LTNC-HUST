package Buoi7.Assignment;

import java.io.*;
import java.util.Random;

/**
 * Viết chương trình tạo tệp nhị phân có tên Ass5_Ex3.dat nếu nó không tồn tại.
 * Ghi tiếp dữ liệu mới vào nó nếu nó đã tồn tại.
 * Ghi 150 số nguyên được tạo ngẫu nhiên vào tệp bằng Binary I/O (hay còn gọi là vào ra dạng Byte)
 */
public class Bai3 {
    public static void main(String[] args) {
        String fileName = "Ass5_Ex3.dat";

        try {
            // Kiểm tra xem tệp có tồn tại không
            boolean fileExists = new File(fileName).exists();

            // Mở luồng ghi nhị phân
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName, true));

            if (!fileExists) {
                System.out.println("Tạo tệp mới: " + fileName);
            } else {
                System.out.println("Ghi tiếp vào tệp đã tồn tại: " + fileName);
            }

            // Tạo 150 số nguyên ngẫu nhiên và ghi vào tệp
            Random random = new Random();
            for (int i = 0; i < 150; i++) {
                int randomNumber = random.nextInt();
                outputStream.writeInt(randomNumber);
            }

            // Đóng luồng ghi
            outputStream.close();

            System.out.println("Ghi dữ liệu thành công.");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
        }
       /* try {
            // Mở luồng đọc nhị phân
            DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));

            System.out.println("Nội dung của tệp " + fileName + ":");

            // Đọc và hiển thị các số nguyên từ tệp
            while (inputStream.available() > 0) {
                int number = inputStream.readInt();
                System.out.println(number);
            }

            // Đóng luồng đọc
            inputStream.close();

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc từ tệp: " + e.getMessage());
        }*/
    }
}
