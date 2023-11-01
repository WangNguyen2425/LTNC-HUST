package Buoi7.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Viết chương trình đếm số ký tự, số từ, số dòng của một tệp văn bản .txt nào đó
 * (sinh viên tự tạo tệp và nội dung của tệp).
 * Các từ được ngăn cách nhau bởi ký tự dấu cách.
 * @author Nguyễn Việt Hoàng 20192874
 */
public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/Assignment/bai1.txt");
        int soKiTu = 0;
        int soTu =0;
        int soDong =0;
        Scanner scanner = new Scanner(file);
        // trong khi dòng tiếp theo vẫn có dữ liệu, duyệt từng dòng
        while (scanner.hasNextLine()){
                String line =  scanner.nextLine(); // dòng
                soKiTu += line.length();
            // Sử dụng phương thức split() để tách các từ trong 1 dòng và lưu vào mảng, trim() để loại bỏ khooảng trắng đầu và cuối
            String[] words = line.trim().split(" ");
            /**
             * Ký tự đặc biệt \\s đại diện cho khoảng trắng và + chỉ ra rằng có thể có nhiều khoảng trắng liên tiếp
             * tất cả chúng sẽ được coi là một khoảng trắng duy nhất.
             */
            soTu += words.length;
            soDong ++; // mỗi lần có 1 dòng thì số dòng tăng lên 1
        }

        scanner.close();
        System.out.println("Số kí tự là: " + soKiTu);
        System.out.println("Số từ là: " + soTu);
        System.out.println("Số dòng là: " + soDong);

    }
}
