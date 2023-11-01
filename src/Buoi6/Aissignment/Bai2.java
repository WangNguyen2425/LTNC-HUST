package Buoi6.Aissignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Viết chương trình nhắc người dùng đọc hai số nguyên và hiển thị tổng của chúng.
 * Chương trình của bạn sẽ nhắc người dùng đọc lại số nếu đầu vào không chính xác.
 * (Gợi ý:sử dụng lớp ngoại lệ InputMismatchException)
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        /**
         *   khởi tạo biến boolean trả về true nếu người dùng nhập đúng kiểu dữ liệu và false nếu người dùng nhập sai
         */
        boolean inputValidated = false;
        while (!inputValidated) {
            try {
                System.out.print("Nhập số nguyên đầu tiên: ");
                firstNumber = sc.nextInt();
                System.out.print("Nhập số nguyên thứ hai: ");
                secondNumber = sc.nextInt();
                inputValidated = true;
            } catch (InputMismatchException e) {
                System.out.println("Bạn cần nhập vào hai số nguyên, hãy kiểm tra và thử lại");
                sc.nextLine(); // nextLine() để xóa bộ đệm và cho phép người dùng nhập lại đầu vào
            }
        }
        System.out.println("Tổng của hai số vừa nhập là: " + (firstNumber + secondNumber));
        sc.close(); // giải phóng tài nguyên
    }
}
