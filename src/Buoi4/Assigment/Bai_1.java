package Buoi4.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Nguyễn Việt Hoàng 20192874
 */
class FanComparator implements Comparator <Fan> {
    @Override
    public int compare(Fan o1, Fan o2) {
        if(o1.getSpeed() > o2.getSpeed()){
            return 1;
        }
        else if(o1.getSpeed() < o2.getSpeed()) {
            return -1;
        }
        else return 0;
    }
}
class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Xanh Lam";

    public Fan() {
        // hàm khởi tạo không đối số
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            // để có thể hiển thị tốc độ quạt dưới dạng text
            String speedToString;
            if (speed == 1) {
                speedToString = "SLOW";
            } else if (speed == 2) {
                speedToString = "MEDIUM";
            } else {
                speedToString = "FAST";
            }
            return "Quạt bật\n" +
                    "Tốc độ quạt là: " + speedToString +
                    "\nBán Kính quạt là: " + radius +
                    "\nMàu sắc quạt là: " + color;
        } else {
            // do quạt tắt nên ko cần hiển thị tốc độ quạt
            return "Quạt tắt"
                    + "\nBán Kính quạt là: " + radius +
                    "\nMàu sắc quạt là: " + color;
        }
    }
}

public class Bai_1 {
    public static void main(String[] args) {
        // khởi tạo 2 đối tượng của lớp Fan
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        // gán tốc độ tối đa, bán kính 10, màu vàng và được bật cho quạt đầu tiên
        fan1.setOn(true); // bật quạt
        fan1.setSpeed(Fan.FAST); // set tốc độ quạt là Fast
        fan1.setRadius(10);
        fan1.setColor("Vàng");
        // gán tốc độ trung bình bán kính 5, màu xanh lam và bị tắt cho quạt 2
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("Xanh Lam");

        // in thông tin về hai quạt quạt
        System.out.println("\tThông số quạt thứ nhất là: ");
        System.out.println(fan1.toString());
        /** In ra thông tin như sau
         * Quạt bật
         * Tốc độ quạt là: FAST
         * Bán Kính quạt là: 10.0
         * Màu sắc quạt là: Vàng
         */
        System.out.println("\tThông số quạt thứ hai là: ");
        System.out.println(fan2.toString());
        /** In ra thông tin như sau
         * Quạt tắt
         * Bán Kính quạt là: 5.0
         * Màu sắc quạt là: Xanh Lam
         */
        List<Fan> fans = new ArrayList<>();
        fans.add(fan1);
        fans.add(fan2);
        fans.sort(new FanComparator());
        System.out.println(fans);
    }
}
