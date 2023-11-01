package Buoi7.Assignment;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Tạo một tệp dữ liệu có 1.000 dòng.
 * Mỗi dòng trong tệp bao gồm first name (tên), last name (họ), rank (chức vụ), và salary (tiền lương) của một thành viên trong khoa.
 * Họ và tên của thành viên trong khoa tại dòng thứ i là FirstNamei và LastNamei.
 * Chức vụ được giao ngẫu nhiên từ 3 chức vụ sau: assistant (trợ giảng), teacher (giảng viên), associate (phó giáo sư).
 * Tiền lương được tạo ngẫu nhiên dưới dạng một số double.
 * Tiền lương cho một assistant nên nằm trong khoảng 50000 đến 80000, teacher từ 60000 đến 110000 và cho associate từ 75000 đến 130000.
 * Các dữ liệu trên được lưu trong tệp Salary.txt như tệp mẫu đính kèm.
 */
public class Bai7_1 {
    public static void main(String[] args) {
        String fileName = "Salary.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            Random random = new Random();
            String[] firstNames = {"Hoa", "Hoàng", "Anh", "Hường", "Lan", "Huệ","Ngọc","Tùng","Nam","Toàn","Nhi"};
            String[] lastNames = {"Nguyễn", "Trần", "Vũ", "Hoàng", "Ngô", "Đinh","Chu","Hán"};
            String[] ranks = {"assistant", "teacher", "associate"};

            for (int i = 1; i <= 1000; i++) {
                String firstName = firstNames[random.nextInt(firstNames.length)];
                String lastName = lastNames[random.nextInt(lastNames.length)];
                String rank = ranks[random.nextInt(ranks.length)];
                double salary = generateSalary(rank, random);

                String line = firstName + " " + lastName + " " + rank + " " + salary;
                writer.write(line);
                writer.newLine();
            }

            writer.close();

            System.out.println("Tạo tệp dữ liệu thành công.");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo tệp dữ liệu: " + e.getMessage());
        }
    }

    private static double generateSalary(String rank, Random random) {
        double minSalary;
        double maxSalary;

        if (rank.equals("assistant")) {
            minSalary = 50000;
            maxSalary = 80000;
        } else if (rank.equals("teacher")) {
            minSalary = 60000;
            maxSalary = 110000;
        } else {
            minSalary = 75000;
            maxSalary = 130000;
        }

        return minSalary + (maxSalary - minSalary) * random.nextDouble();
    }
}
