package Buoi13.Assignment;

public class PrintNum implements Runnable {
    private int num;

    public PrintNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i= 1 ;i <= num;i++){
            System.out.print(i);
          /*  try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }

    }
}
