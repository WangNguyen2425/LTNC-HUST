package Buoi3.Assignment3;

public class Bai1 {
    public static void main(String[] args) {
        Account account = new Account(1012, 20000000f, 4.5);
        account.withdraw(1500000f); // rút 1 triệu 500k
        account.deposit(3000000f); // nạp 3 triệu
        System.out.printf("Số dư hiện tại của tài khoản là: %12.2f Đồng\n", account.getBalance());
        System.out.println("Tiền lãi hàng tháng là: " + account.getMonthlyInterest() + " Đồng");
        System.out.println("Ngày tạo tài khoản là: " + account.getDateCreated());
    }
}
