package Buoi6.Aissignment;

import java.util.Random;
import java.util.Scanner;

/**
 * Viết chương trình đáp ứng các yêu cầu sau: Tạo một mảng với 100 số nguyên được chọn ngẫu nhiên.
 * Nhắc người dùng nhập chỉ số của mảng, sau đó hiển thị giá trị phần tử tương ứng.
 * Nếu chỉ mục được chỉ định nằm ngoài giới hạn, hiển thị thông báo "Ngoài giới hạn".
 * (Gợi ý: sử dụng lớp ngoại lệ ArrayIndexOutOfBoundsException)
 */
public class Bai3 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Random random = new Random();
        // khởi tạo mảng 100 phần tử với giá trị ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(12345);
        }
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập chỉ số của mảng: ");
                int index = sc.nextInt();
                System.out.println("Giá trị của mảng tại chỉ số " + index + " là " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bạn đã truy cập ngoài giới hạn. Vui lòng nhập lại chỉ số hợp lệ từ 0 đến 99.");
                sc.nextLine();
            }
        }
    }

}

