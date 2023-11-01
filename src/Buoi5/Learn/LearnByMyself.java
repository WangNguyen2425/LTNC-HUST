package Buoi5.Learn;

public class LearnByMyself {
    public static void main(String[] args) {
        /*try {
            int[] arr = new int[5];
            arr[6] = 10; // Phát sinh ArrayIndexOutOfBoundsException
            int x = 10 / 0; // Phát sinh ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: truy cập ngoài chỉ số của mảng.");
        } catch (Exception e) {
            System.out.println("Lỗi: chia một số cho 0.");
        }*/
        MyClass myClass = new MyClass();
        myClass.testOnclick(new OnclickListener() {
            @Override
            public void onClick(int a) {

            }
        });
    }
    public class MyABC implements OnclickListener{

        @Override
        public void onClick(int a) {

        }
    }
}
