package Buoi4.Learn;

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
        if (this.value % 2 == 0) {
            return true;
        }
        return false;
    }
    public boolean isOdd() {
        if (this.value % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        int j = 0;
        if (this.value == 2) {
            return true;
        } else {
            for (int i = 2; i <= this.value; i++) {
                if (this.value % i == 0) {
                    j++;
                }
            }
            return j == 1;
        }
    }


    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value) {
        int j = 0;
        if (value == 2) {
            return true;
        } else {
            for (int i = 2; i <= value; i++) {
                if (value % i == 0) {
                    j++;
                }
            }
            return j == 1;
        }
    }
    public static boolean isEven(MyInteger val) {
        if (val.getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger val) {
        if (val.getValue() % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(MyInteger val) {
        int j = 0;
        if (val.getValue() == 2) {
            return true;
        } else {
            for (int i = 2; i <= val.getValue(); i++) {
                if (val.getValue() % i == 0) {
                    j++;
                }
            }
            return j == 1;
        }
    }
    public boolean equals (int value) {
        return this.value == value;
    }
    public boolean equals (MyInteger val) {
        return this.value == val.getValue();
    }

    public static int[] parseInt(char [] chars){
        int arr[] = new int[chars.length];
        for(int i = 0; i < chars.length;i++){
            arr[i] = (int) chars[i]  - '0';
        }
        return arr;
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}
public class Bai2 {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(5);
        MyInteger myInteger2 = new MyInteger(9);
        System.out.println("Giá trị của myInteger1 là: " + myInteger1.getValue());
        System.out.println("Giá trị của myInteger1 là số chẵn: " + myInteger1.isEven());
        System.out.println("Giá trị của myInteger1 là số lẻ: " + myInteger1.isOdd());
        System.out.println("Giá trị của myInteger1 là số nguyên tố: " + myInteger1.isPrime());

        System.out.println("số 8 là số chẵn: "  + MyInteger.isEven(8));
        System.out.println("số 8 là số lẻ: "  + MyInteger.isOdd(8));
        System.out.println("số 8 là số nguyên tố: "  + MyInteger.isPrime(8));

        System.out.println("Giá trị của myInteger2 là: " + myInteger2.getValue());
        System.out.println("Giá trị của myInteger2 là số chẵn: "  + MyInteger.isEven(myInteger2));
        System.out.println("Giá trị của myInteger2 là số lẻ:"  + MyInteger.isOdd(myInteger2));
        System.out.println("Giá trị của myInteger2 là số nguyên tố: "  + MyInteger.isPrime(myInteger2));


        System.out.println("myInteger1.equals(7): " + myInteger1.equals(7));
        System.out.println("myInteger1.equals(myInteger2): " + myInteger1.equals(myInteger2));


        char[] c = {'1', '9', '2', '4', '3'};
        System.out.print( "Mảng char được chuyển sang mảng int là: "
                + Arrays.toString(MyInteger.parseInt(c)));
        String s = "22312";
        System.out.print("\nKết quả trả về của hàm parseInt với tham số là chuỗi s= \"22312\" là: " + MyInteger.parseInt(s));
    }
}

