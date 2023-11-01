package Buoi8.Learn;
import java.util.ArrayList;
import java.util.Iterator;



public class SpeedInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int size = 5000000;
        // Thêm các số nguyên từ 1 đến 5000000 vào danh sách
        for (int i = 1; i <= size; i++) {
            numbers.add(i);
        }
        // Duyệt qua danh sách bằng iterator và đo thời gian thực thi
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
        }
        long endTime = System.currentTimeMillis();
        long iteratorTime = endTime - startTime;

        // Duyệt qua danh sách bằng cách sử dụng hàm get (chỉ mục) và đo thời gian thực thi
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
        }
        endTime = System.currentTimeMillis();
        long getIndexTime = endTime - startTime;



        System.out.println("Thời gian thực thi khi duyệt qua danh sách bằng iterator: " + iteratorTime + " ms");
        System.out.println("Thời gian thực thi khi duyệt qua danh sách bằng hàm get (chỉ mục): " + getIndexTime + " ms");
    }
}