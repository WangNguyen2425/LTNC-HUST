package Buoi6.Aissignment;
abstract class ABC{
    int a = 5;
    public abstract void print();
}
class BCD extends ABC{

    @Override
    public void print() {
        System.out.println("BCD");
    }
}
public abstract class LearnAbstract {
    public static void main(String[] args) {
        ABC abc = new ABC() {
            @Override
            public void print() {

            }
        };
        System.out.println(abc.a);


    }
}
