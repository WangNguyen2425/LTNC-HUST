package Buoi2.Assignment;

import java.util.Date;
import java.util.Scanner;

/**
 *▪ Thuộc tính startTime và endTime
 * ▪ Các hàm thành viên để get và set các thuộc tính
 * ▪ Hàm tạo không đối khởi tạo startTime bằng thời gian hiện tại
 * của máy tính
 * ▪ Phương thức start() để đặt lại startTime về thời gian hiện tại
 * của máy tính
 * ▪ Phương thức stop() để đặt endTime về thời gian hiện tại của
 * máy tính
 * ▪ Phương thức getElapsedTime() trả về thời gian đã trôi qua với
 * đơn vị là milliseconds
 * ▪ Vẽ hiểu đồ lớp UML cho lớp Stopwatch
 */
class Stopwatch{

    private Date startTime;
    private Date stopTime;
    public Stopwatch() {
       this.startTime = new Date();
    }
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }
    public void start(){
        this.setStartTime(new Date());
    }
    public void stop(){
      this.setStopTime(new Date());
    }
    public long getElapsedTime(){
        // trả về thời gian đã trôi qua với  đơn vị là milliseconds so với startTime
        return (this.stopTime.getTime() - this.startTime.getTime());
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khởi tạo một đồng hồ bấm giờ
        Stopwatch stopwatch = new Stopwatch();
        // khởi tạo biến boolean lưu trạng thái của chương trình chạy hay tắt
        boolean running = false;
        System.out.println("Hướng dẫn sử dụng: Nhập vào từ bàn phím phím 'S' để bắt đầu và nhập vào phím 'S' một lần nữa để dừng: ");
        while (true){
            System.out.print("Nhập vào phím S: ");
            char input = sc.next().charAt(0);
            if(input == 's'){ // nếu người dùng nhập đúng phím S

                /** kiểm tra biến boolean running
                 * nếu running = false tức là chương trình đang tắt người dùng nhập phím S tức là muốn bắt đầu chương trình
                 *
                 * nếu running = true, tức là chương trình đang chạy khi người dùng nhập vào phím S lúc này là nguời dùng muốn dừng chương trình
                 */
                if(running){  // running = true -> dừng chương trình
                    running = false;
                    stopwatch.stop();
                    System.out.println("\tKết thúc bấm giờ lúc: " + stopwatch.getStopTime());
                    System.out.println("\tThời gian đã trôi qua là: " + stopwatch.getElapsedTime() +" Mili giây");
                }
                else { // running = false -> bắt đầu chương trình
                    running = true;
                    stopwatch.start();
                    System.out.println("\tBắt đầu bấm giờ lúc: " + stopwatch.getStartTime());

                }
            }
        }

    }
}
