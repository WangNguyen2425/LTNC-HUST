package Buoi8.Assignment;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Tính tổng dung lượng của một tệp hoặc một thư mục sử dụng hàng đợi.
 * Gợi ý: phương thức length() trả về kích thước của tệp (byte), trả về 0 nếu không tồn tại tệp hoặc đó là một thư mục.
 */
public class Bai3 {
    public static void main(String[] args) {
        String filePath = "Assignment_7_bai2.txt";
        long totalSize = calculateTotalSize(filePath);
        if(totalSize > 0 ){
            System.out.println("Tổng dung lượng của file là: " + totalSize);
        }
        else {
            System.out.println("Không tìm thấy tệp");
        }
    }

    private static long calculateTotalSize(String filePath) {
        File file = new File(filePath);
        if(!file.exists()){
            // file ko tồn tại thì return về -1 trả về để print ra file ko tồn tại
            return -1;
        }
        long totalSize = 0;

        Queue<File> queue = new LinkedList<>();
        queue.add(file);
        // sử dụng hàm đệ quy
        while (!queue.isEmpty()){
            File current = queue.poll(); // lấy về file hiện tại lưu vào current và xóa file đó
            if(current.isDirectory()){  // nếu file là một thư mục thì tạo một mảng chứa các file trong thư mục đó
                File[] files = current.listFiles();
                for(File f : files){
                    queue.offer(f);
                }
            }  // lặp đệ quy cho đến khi file không phải là thư mục
                else {
                    totalSize += current.length(); // nếu là một file duy nhất không phải thư mục
                }
            }
            // sau khi chạy hết while thì return lại dung lượng thư mục hoặc file
            return totalSize;
        }
    }

