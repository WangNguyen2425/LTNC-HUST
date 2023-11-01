package Buoi7.Assignment;

import java.io.*;
import java.util.Random;

/**
 * Viết chương trình tạo tệp văn bản có tên Ass5_Ex2.txt nếu tệp đó chưa tồn tại.
 * Ghi tiếp dữ liệu mới vào tệp nếu nó đã tồn tại.
 * Ghi 150 số nguyên được tạo ngẫu nhiên vào tệp.
 * Các số nguyên được phân tách bằng dấu cách.
 */
public class Bai2 {
    public static void main(String[] args) throws IOException {
        // Kiểm tra xem tệp đã tồn tại chưa
        boolean fileExists = fileExists("Ass5_Ex2.txt");
        /**
         *  FileWriter sẽ được tạo với chế độ ghi tiếp, nghĩa là dữ liệu mới sẽ được ghi thêm vào cuối tệp nếu tệp đã tồn tại.
         *  Ngược lại, nếu fileExists là false, FileWriter sẽ được tạo với chế độ ghi mới, nghĩa là tệp sẽ bị ghi đè và dữ liệu cũ sẽ bị xóa đi.
         */
        FileWriter fileWriter = new FileWriter("Ass5_Ex2.txt", fileExists);
        PrintWriter output = new PrintWriter(fileWriter);
        Random random = new Random();
        for(int i = 0; i<150;i++){
            output.print(random.nextInt());
            output.print(" ");
        }
        fileWriter.close();

    }
    // Kiểm tra xem tệp có tồn tại hay không
    private static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
}
}
