package Buoi3;

import java.util.Date;

/**
 *@author  Nguyễn Việt Hoàng 20192874
 */
class Account {
    private int id ;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return (this.getMonthlyInterestRate() * this.balance) / 100;
    }
    public void withdraw(double amount){
        if(this.getBalance() >= amount){
            this.balance =  this.getBalance() - amount;
        }else {
            System.out.println("Số dư bạn không đủ");
        }

    }
    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
public class KiemTra_3_4_2022 {
    public static void main(String[] args) {
        Buoi3.Assignment3.Account acc1 = new Buoi3.Assignment3.Account();
        Buoi3.Assignment3.Account acc2 = new Buoi3.Assignment3.Account(24,2000000L,6);
        acc1.setId(2);
        acc1.setBalance(3000000L);
        acc1.setAnnualInterestRate(12);
        System.out.println("Ta có hai account");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("Acc1 được tạo vào ngày: " + acc1.getDateCreated().toString());
        System.out.println("Acc2 được tạo vào ngày: " + acc2.getDateCreated().toString());
        System.out.println("Lãi suất hàng tháng của acc1 là: " + acc1.getMonthlyInterest() + " Đồng với lãi suất hàng tháng là: " + acc1.getMonthlyInterestRate()+ "%");
        System.out.println("Lãi suất hàng tháng của acc2 là: " + acc2.getMonthlyInterest() + " Đồng với lãi suất hàng tháng là: " + acc2.getMonthlyInterestRate()+ "%");
        acc1.withdraw(100000L); // rút 100k vào acc 1
        System.out.println("Số dư của acc1 sau khi rút 100k là: " + acc1.getBalance() + "Đồng");
        acc2.withdraw(2100000L); // prin ra số dư ko đủ
        acc2.deposit(100000L); // vào acc2
        acc2.withdraw(2100000L);
        System.out.println("Số dư của acc2 sau khi rút 2100k là: " + acc2.getBalance() + "Đồng");

    }
}
