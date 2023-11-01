package Buoi7.Assignment;
import java.io.*;
import java.util.Date;
/**
 * Viết chương trình lưu một mảng gồm năm giá trị int 1, 2, 3, 4 và 5,
 * một đối tượng Date cho thời điểm hiện tại và giá trị double 5.5 vào tệp có tên là Ex5.dat.
 */
public class Bai5 {
    public static void main(String[] args) {
        String fileName = "Ex5.dat";

        int[] numbers = {1, 2, 3, 4, 5};
        Date currentDate = new Date();
        double value = 5.5;

        try {
            // Mở luồng ghi nhị phân
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));

            // Ghi mảng số nguyên vào tệp
            for (int i = 0; i < numbers.length; i++) {
                outputStream.writeInt(numbers[i]);
            }

            // Ghi đối tượng Date vào tệp
            outputStream.writeLong(currentDate.getTime());

            // Ghi giá trị double vào tệp
            outputStream.writeDouble(value);

            // Đóng luồng ghi
            outputStream.close();

            System.out.println("Ghi dữ liệu vào tệp thành công.");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
        }
    }
}
