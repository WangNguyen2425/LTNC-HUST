package Buoi13.Assignment;

public class PrintChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for(int i= 0 ;i < times;i++){
            System.out.print(charToPrint);
        /*    try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
