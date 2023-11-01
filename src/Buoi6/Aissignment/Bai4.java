package Buoi6.Aissignment;

import java.text.DecimalFormat;
import java.util.Date;

class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    /**
     *  phương thức tính tổng diện tích các hình, để tính tổng được thì phải tạo hàm getArea để sử dụng tính đa hình của Hướng đối tượng
      */
    public double getArea() {
        return 0;
    }
    public static double sumArea(GeometricObject[] a) {
        double sumArea = 0;
        for (GeometricObject shape : a) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }


}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle() {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("\n\tThông tin về Circle: ");
        System.out.print(" Bán kính: " + radius
                + "\n Màu sắc: " + this.getColor()
                + "\n Đã tô màu: " + this.isFilled()
                + "\n Ngày tạo: " + this.getDateCreated().toString()
                + "\n Diện tích: " + df.format(this.getArea())
                + "\n Chu vi: " + df.format(this.getPerimeter())
                + "\n Đường kính: " + this.getDiameter()
        );
    }

}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, Date dateCreated, double width, double height) {
        super(color, filled, dateCreated);
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

    @Override
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void printRectangle() {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("\n\tThông tin về Rectangle: ");
        System.out.print(" Chiều dài : " + height
                + "\n Chiều cao: " + width
                + "\n Màu sắc: " + this.getColor()
                + "\n Đã tô màu: " + this.isFilled()
                + "\n Ngày tạo: " + this.getDateCreated().toString()
                + "\n Diện tích: " + df.format(this.getArea())
                + "\n Chu vi: " + df.format(this.getPerimeter())
        );
    }
}

class Square extends GeometricObject {
    private double side;

    public Square() {
    }

    public Square(String color, boolean filled, Date dateCreated, double side) {
        super(color, filled, dateCreated);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void printSquare() {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("\n\tThông tin về Square: ");
        System.out.print(" Chiều dài cạnh : " + side
                + "\n Màu sắc: " + this.getColor()
                + "\n Đã tô màu: " + this.isFilled()
                + "\n Ngày tạo: " + this.getDateCreated().toString()
                + "\n Diện tích: " + df.format(this.getArea())
                + "\n Chu vi: " + df.format(this.getPerimeter())
        );
    }
}

public class Bai4 {
    public static void main(String[] args) {
        // khởi tạo mảng đối tượng
        GeometricObject a[] = new GeometricObject[3];
        a[0] = new Circle(10, "Red", true, new Date());
        a[1] = new Rectangle("Green", true, new Date(), 4, 7);
        a[2] = new Square("Black", true, new Date(), 5);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Tổng diện tích các hình trong mảng là: " + df.format(GeometricObject.sumArea(a)));


        Circle circle = (Circle) a[0];
        Rectangle rectangle = (Rectangle) a[1];
        Square square = (Square) a[2];
        System.out.println("\nThông tin của từng hình là: ");
        circle.printCircle();;
        rectangle.printRectangle();
        square.printSquare();

    }
}
