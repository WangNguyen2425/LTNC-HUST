package Buoi2.Assignment;

/**
 * ▪ Thuộc tính: width và height thuộc kiểu double
 * ▪ Hàm tạo: hàm tạo mặc định, và hàm tạo có đối số để khởi tạo
 * đối tượng Rectangle với width và height được chỉ định
 * ▪ Các phương thức get và set cho các thuộc tính
 * ▪ Phương thức getArea() trả về diện tích hình chữ nhật
 * ▪ Phương thức getPerimeter() trả về chu vi hình chữ nhật
 */
class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }


}
public class Bai3 {
    public static void main(String[] args) {
            // khởi tạo
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3,4);
        rectangle1.setHeight(12);
        rectangle1.setWidth(6);
        System.out.println("Ta có 2 hình chữ nhật");
        System.out.println("Hình chữ nhật thứ nhất có chiều rộng là: " +rectangle1.getWidth() + " chiều cao là: " + rectangle1.getHeight() );
        System.out.println("Hình chữ nhật thứ hai có chiều rộng là: " +rectangle2.getWidth() + " chiều cao là: " + rectangle2.getHeight() );
        System.out.println("\tChu vi HCN thứ nhất là: " + rectangle1.getPerimeter());
        System.out.println("\tDiện tích HCN thứ nhất là: " + rectangle1.getArea());
        System.out.println("\tChu vi HCN thứ hai là: " + rectangle1.getPerimeter());
        System.out.println("\tDiện tích HCN thứ nhất là: " + rectangle1.getArea());
    }
}
