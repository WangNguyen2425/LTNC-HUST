package Buoi8.Learn;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Logger;

/**
 * viết chương trình thử nghiệm lưu trữ danh saách 5 triệu số nguyên tăng dần (1,2,...5000000) trong Arraylist
 * hiển thị thời gian thực thi qua danh sách bằng iterator và hiển thị thời gian thực hiện khi duyệt danh sách bằng cách sử dụng hàm get
 *
 */
public class Bai2_learnArrayList {
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
        // dùng get
        Long start2 = System.currentTimeMillis();
        for(int i = 0 ; i< 5000000;i++){
           arrayList.get(i);
           // System.out.println(arrayList.get(i));
        }
        Long end2 = System.currentTimeMillis();

        System.out.println( "thực thi duyệt sử dụng iterator trong " + (end - start)+" mili giây");
        System.out.println( "thực thi sử dụng hàm get là  trong " + (end2 - start2)+" mili giây");

    }
}
