package Buoi3.Assignment3;

import java.util.Date;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo 1 list account
        Account listAccount[] = new Account[10];
        // cấp khởi tạo các account với id từ 0 đến 9 với số dư là 1000000
        for (int i = 0; i < listAccount.length; i++) {
            listAccount[i] = new Account(i, 1000000f, 0);
        }
        while (true) {   // khởi tạo một vòng lặp vô hạn để một khi hệ thống khởi động thì ko bao giờ dừng
            int idInput = -1;
            boolean trueInputType = false;
            // xử lí việc nhập id của người dùng, nếu ko hợp lệ yêu cầu nhập lại
            while (!trueInputType) {
                System.out.print("Enter an id: ");
                try {
                    idInput = sc.nextInt();
                    if (idInput >= 0 && idInput <= 9) {
                        trueInputType = true;
                    } else {
                        System.out.println("There is no account matching your id, please try again !");
                    }
                } catch (Exception e) {
                    System.out.println("You just entered the wrong type of id, id is an integer from 0 to 9 please re-enter!");
                    // nếu người dùng nhập sai kiểu dữ liệu thì đọc kí tự đó và chuyển đến lần nhập tiếp theo
                    // VD người dùng nhập vào 1 kí tự thì nextInt() sẽ ko đọc được giá trị vừa nhập, nên phải bổ sung nextLine để đọc và bỏ qua giá trị đó
                    sc.nextLine();
                }
            }
            boolean isExitMenu = false;  // biến này để ngắt vòng lặp while menu khi người dùng chọn 4 và quay lại nhập ID
            while (!isExitMenu) {
                // hiển thị ra menu
                System.out.println();
                System.out.println("Main menu");
                System.out.println("1: Check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                boolean trueChoice = false;
                int userChoice = -1;
                while (!trueChoice) {
                    try {
                        System.out.print("Enter a choice: ");
                        userChoice = sc.nextInt();
                        // nếu lựa chọn của người dùng có trong 1 trong 4 lựa chọn thì break while, ko thì yêu fu nhập lại
                        if (userChoice >= 1 && userChoice <= 4) {
                            trueChoice = true;
                        } else {
                            System.out.print("Your choice is not valid, please re-enter");
                        }
                    } catch (Exception e) {
                        System.out.print("Your choice is not valid, please re-enter");
                        sc.nextLine();
                    }
                }

                switch (userChoice) {
                    case 1: {
                        System.out.print("The balance is: " + listAccount[idInput].getBalance());
                        break;
                    }
                    case 2: {
                        System.out.print("Enter an amount to withdraw: ");
                        double amount = sc.nextDouble();
                        listAccount[idInput].withdraw(amount);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter an amount to deposit: ");
                        double amount = sc.nextDouble();
                        listAccount[idInput].deposit(amount);
                        break;
                    }
                    case 4: {
                        isExitMenu = true;  // thoát khỏi vòng lặp while để quay lại nhập id
                    }
                }
            }
        }
    }
}

