package Buoi8.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearnListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"ha noi");
        list.add(1,"Hung Yen");
        list.add("thai binh");  // sẽ được add vào cuối danh sách, ở đây tức là vị trí với index = 4, ưu tiên add các phần tử chỉ rõ chỉ mục trước
        list.add(2,"hai duong");
        list.add(3,"hai duong");

       /* ListIterator <String> listIterator = list.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
         listIterator.set("Thai bình mồ hôi rơi");
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());*/
        System.out.println(list.lastIndexOf("hai duong"));
        ArrayList <String> arrayList = new ArrayList<>(list);
        arrayList.forEach(a -> System.out.println(a));
    }
}
