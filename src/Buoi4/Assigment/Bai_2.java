package Buoi4.Assigment;

import java.util.Arrays;

class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        // hàm kiểm tra số chẵn
        return this.value % 2 == 0;
    }

    // các phương thức nonstatic
    public boolean isOdd() {
        // hàm kiểm tra số lẻ
        return this.value % 2 == 1;
    }

    public boolean isPrime() {
        /*// hàm kiểm tra số nguyên tố
        int count = 0;  // biến này lưu số lượng ước của value
        if (this.value == 2) {
            return true;
        } else {
            for (int i = 2; i <= this.value; i++) {
                if (this.value % i == 0) {
                    count++;
                }
            }
             *//*sau vòng for để đếm số ước của value trong các giá trị
             từ 2 đến chính nó nếu chỉ có 1 ước ( là chính nó ) thì đó là số nguyên tố *//*
            return count == 1;
        }*/
        // hàm kiểm tra số nguyên tố
        if (this.value <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(this.value);
        /*Duyệt qua các số từ 2 đến căn bậc hai của số cần kiểm tra.
         Nếu số cần kiểm tra chia hết cho bất kỳ số nào trong đoạn này, thì số đó không phải là số nguyên tố.*/
        for (int i = 2; i <= sqrt; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }


    // các phương thức static
    public static boolean isEven(int value) {
        // hàm kiểm tra số chẵn
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        // hàm kiểm tra số lẻ
        return value % 2 == 1;
    }

    public static boolean isPrime(int value) {
        // hàm kiểm tra số nguyên tố
        if (value <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(value);
        /*Duyệt qua các số từ 2 đến căn bậc hai của số cần kiểm tra.
         Nếu số cần kiểm tra chia hết cho bất kỳ số nào trong đoạn này, thì số đó không phải là số nguyên tố.*/
        for (int i = 2; i <= sqrt; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }


    // các phương thức satic với tham số là đối tượng MyInteger
    public static boolean isEven(MyInteger val) {
        // hàm kiểm tra số chẵn
        if (val.getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger val) {
        // hàm kiểm tra số lẻ
        return val.getValue() % 2 == 1;
    }

    public static boolean isPrime(MyInteger val) {
        // hàm kiểm tra số nguyên tố
        if (val.getValue() <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(val.getValue());
        /*Duyệt qua các số từ 2 đến căn bậc hai của số cần kiểm tra.
         Nếu số cần kiểm tra chia hết cho bất kỳ số nào trong đoạn này, thì số đó không phải là số nguyên tố.*/
        for (int i = 2; i <= sqrt; i++) {
            if (val.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    // phương thức equals
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger val) {
        return this.value == val.getValue();
    }

    public static int[] parseInt(char[] chars) {
        /* phương thức tĩnh chuyển mảng kí tự sang giá trị int
         ở đây em hiểu đề là cho mảng kí tự  charArray = {'1', '2', '3', '4', '5'};
         đầu ra sẽ là mảng số nguyên { 1 , 2 , 3, 4, 5 }
         */
        int arr[] = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = (int) chars[i] - '0';
        }
        return arr;
    }

    public static int parseInt(String s) {
        // phương thức tĩnh chuyển chuỗi sang giá trị int, ở đây em hiểu đề là chuỗi "12345" thành số 12345
        return Integer.parseInt(s);
    }
}

public class Bai_2 {
    public static void main(String[] args) {
        // khởi tạo 2 đối tượng của lớp MyInteger
        MyInteger myInteger1 = new MyInteger(5);
        MyInteger myInteger2 = new MyInteger(5);
        // kiểm tra các hàm nonstatic
        System.out.println("\t Kiểm tra các hàm nonstatic");
        System.out.println("Giá trị của myInteger1 là: " + myInteger1.getValue());  // test hàm getValue  -> 5
        System.out.println("Giá trị của myInteger1 là số chẵn: " + myInteger1.isEven()); // test hàm isEven -> false
        System.out.println("Giá trị của myInteger1 là số lẻ: " + myInteger1.isOdd()); // test hàm isOdd -> true
        System.out.println("Giá trị của myInteger1 là số nguyên tố: " + myInteger1.isPrime()); // test hàm isPrime -> true
        // kiểm tra các hàm static tham số (int)
        System.out.println("\t Kiểm tra các hàm static tham số (int)");
        System.out.println("số 8 là số chẵn: " + MyInteger.isEven(8)); // test hàm static isEven(int) -> true
        System.out.println("số 8 là số lẻ: " + MyInteger.isOdd(8)); // test hàm static isOdd(int) -> false
        System.out.println("số 8 là số nguyên tố: " + MyInteger.isPrime(8)); // test hàm static isPrime(int) -> false
        // kiểm tra các hàm static tham số (MyInteger)
        System.out.println("\t Kiểm tra các hàm static tham số (MyInteger)");
        System.out.println("Giá trị của myInteger2 là: " + myInteger2.getValue());  // test hàm getValue  -> 5
        System.out.println("Giá trị của myInteger2 là số chẵn: " + MyInteger.isEven(myInteger2)); // test hàm static isEven(MyInteger) -> false
        System.out.println("Giá trị của myInteger2 là số lẻ:" + MyInteger.isOdd(myInteger2)); // test hàm static isOdd(MyInteger)  -> true
        System.out.println("Giá trị của myInteger2 là số nguyên tố: " + MyInteger.isPrime(myInteger2)); // test hàm static isPrime(MyInteger)  -> true
        // kiểm tra hàm equals
        System.out.println("\t Kiểm tra hàm equals");
        System.out.println("myInteger1.equals(7): " + myInteger1.equals(7)); // test hàm equals(int) -> fasle
        System.out.println("myInteger1.equals(myInteger2): " + myInteger1.equals(myInteger2)); // test hàm equals(MyInteger) -> true
        //  Kiểm tra hàm parseInt
        System.out.println("\t Kiểm tra hàm parseInt");
        char[] charArray = {'1', '2', '3', '4', '5'}; // Mảng kí tự
        System.out.print("Kết quả trả về của hàm parseInt với tham số là mảng charArray = {'1', '2', '3', '4', '5'} là: "
                + Arrays.toString(MyInteger.parseInt(charArray)));  // -> [1, 2, 3, 4, 5]
        String s = "12345";
        System.out.print("\nKết quả trả về của hàm parseInt với tham số là chuỗi s= \"12345\" là: " + MyInteger.parseInt(s)); // -> 12345
    }
}

