package Buoi8.Assignment;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * viết chương trình thử nghiệm lưu trữ danh saách 5 triệu số nguyên tăng dần (1,2,...5000000) trong Arraylist
 * hiển thị thời gian thực thi qua danh sách bằng iterator và hiển thị thời gian thực hiện khi duyệt danh sách bằng cách sử dụng hàm get
 */
public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1 ; i <= 5000000 ; i ++ ){
            arrayList.add(i);
        }
        Iterator<Integer> integerIterator = arrayList.iterator();
        // dùng iterator
        Long start = System.currentTimeMillis();
        while (integerIterator.hasNext()){
            //System.out.println(integerIterator.next());
            integerIterator.next();

        }
        Long end = System.currentTimeMillis();
        System.out.println( "thực thi duyệt sử dụng iterator trong " + (end - start)+" mili giây");
        // dùng get
         start = System.currentTimeMillis();
        for(int i = 0 ; i< 5000000;i++){
            arrayList.get(i);
            // System.out.println(arrayList.get(i));
        }
        end = System.currentTimeMillis();
        System.out.println( "thực thi sử dụng hàm get là  trong " + (end - start)+" mili giây");

    }
}
