package Buoi2.Assignment;

/**
 * @Author Nguyễn Việt Hoàng 20192874
 * Assignment 2
 */
class Point2D {
    private double x;
    private double y;
    // hàm tạo không tham số
    public Point2D() {

    }
    // hàm tạo 2 tham số
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        /**
         * @param x là tọa độ x của điểm được chỉ định point(x,y)
         * @param y là tọa độ y của điểm được chỉ định point(x,y)
         * @return về kết quả khoảng cách của this point (điểm đang đứng gọi hàm) và điểm được chỉ định
         *  trong đó this.x, this.y là tọa độ x, y của điểm đang đứng và x, y là tọa độ của điểm chỉ định tính khoảng cách với điểm this
         */
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double distance(Point2D p) {
        /**
         * nạp chồng phương thức distance
         * @param p là đối tượng của lớp Point2D
         * @return về kết quả khoảng cách của this point (điểm đang đứng gọi hàm) và điểm được chỉ định p
         *  trong đó this.x, this.y là tọa độ x, y của điểm đang đứng. Sử dụng phương thức getX(), getY() để lấy tọa độ của điểm chỉ định p
         */
        return Math.sqrt(Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Bai1 {
    public static void main(String[] args) {
        // hàm main để kiểm tra chương trình
        Point2D point1 = new Point2D(2, 3);
        Point2D point2 = new Point2D(4, 5);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println("Khoảng cách point 1 và điểm (3,5) là: " + point1.distance(3, 5));
        System.out.println("Khoảng cách point 1 và point2 là: " + point1.distance(point2));
    }
}
