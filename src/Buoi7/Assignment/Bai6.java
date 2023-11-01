package Buoi7.Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Giả sử một tệp văn bản chứa các điểm của một học sinh, được phân tách bởi dấu cách.
 * Viết chương trình nhắc người dùng nhập tên tệp cần xử lý.
 * Nếu tệp không tồn tại thì dừng chương trình.
 * Hãy đọc điểm từ tệp và hiển thị tổng số điểm, điểm trung bình của học sinh đó.
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên tệp cần xử lý từ người dùng
        System.out.print("Nhập tên tệp cần xử lý: ");
        String fileName = scanner.nextLine();

        // Kiểm tra xem tệp có tồn tại không
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Tệp không tồn tại.");
            System.exit(0);
        }

        // Đọc điểm từ tệp và tính tổng số điểm và điểm trung bình
        try (  Scanner fileScanner = new Scanner(file)){
            double totalPoints = 0;
            int count = 0;

            while (fileScanner.hasNext()) {
                double grade = fileScanner.nextDouble();
                totalPoints += grade;
                count++;
            }
            // Tính điểm trung bình
            double average = (double) totalPoints / count;

            // Hiển thị kết quả
            System.out.println("Tổng số điểm: " + totalPoints);
            System.out.println("Điểm trung bình: " + average);

        } catch (FileNotFoundException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp.");
            e.printStackTrace();
        }
    }
}
