package Buoi7.Assignment;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Bai4 {
    public static void main(String[] args) {
        String fileName = "Ass5_Ex4.dat";

        try {
            // Mở luồng ghi nhị phân
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));

            System.out.println("Tạo tệp mới: " + fileName);

            // Tạo 100 số double ngẫu nhiên và ghi vào tệp
            Random random = new Random();
            double sum = 0.0;
            for (int i = 0; i < 100; i++) {
                double randomNumber = random.nextDouble();
                outputStream.writeDouble(randomNumber);
                sum += randomNumber;
            }

            // Đóng luồng ghi
            outputStream.close();

            System.out.println("Ghi dữ liệu thành công.");

            // Tính giá trị trung bình của các số trong tệp
            double average = sum / 100;
            System.out.println("Giá trị trung bình của các số trong tệp: " + average);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
        }
    }
}
