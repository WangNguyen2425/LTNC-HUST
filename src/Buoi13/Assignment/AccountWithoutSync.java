package Buoi13.Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
    private static Account account = new Account();
    private static class AddPennyTask implements Runnable{

        @Override
        public void run() {
            account.deposit(1);
        }
    }
    public static class Account {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }
        public  void  deposit(int amount ){
            synchronized (this){
                balance += amount;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0 ; i <100 ; i++){
            executorService.execute(new AddPennyTask());
            System.out.println(Thread.activeCount() );
        }
        executorService.shutdown(); // chờ cho tất cả các tác vụ hoàn thành rồi shutdown

        while (!executorService.isTerminated()){
            System.out.println("What is balance: " + account.getBalance());
        }

    }
}
