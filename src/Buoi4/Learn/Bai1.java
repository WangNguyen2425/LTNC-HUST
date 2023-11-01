package Buoi4.Learn;
class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Xanh Lam";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
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
        if(this.on) {
            return "Fan{ Quạt bật, " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +'}' ;
        }
        else {
            return "Fan{Quạt tắt" + '\'' + ", radius= " + radius +", color='" + color +"'}" ;
        }
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true); // bật quạt
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Vàng");

        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
