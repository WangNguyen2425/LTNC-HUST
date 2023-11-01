package Buoi8.Learn;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);
        /*Collections.shuffle(arrayList);*/
       /* Collections.shuffle(arrayList, new Random(10));
        Collections.fill(arrayList,2);*/
       /* arrayList.forEach(System.out::println);*/
       /* System.out.println(Collections.max(arrayList));*/
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2 ){
                    return -1;
                }
                else if(o1 < o2){
                    return 1;
                }
                else return 0;
            }
        }.reversed());
        System.out.println(arrayList);

        List<String> stringList = new ArrayList<>(arrayList.size());
        for (Integer number : arrayList) {
            stringList.add(String.valueOf(number));
        }

        LinkedList<String> list = new LinkedList<>(stringList);
        list.add(1,"red");
        list.removeLast();
        list.addFirst("green");
        // duyệt bằng con trỏ iterator
        ListIterator<String> listIterator = list.listIterator();
        // duyệt theo đúng chiều
        System.out.println("duyệt bằng iterator theo đúng chiều");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() +" ");
        }
        System.out.println();
        // duyệt theo chiều ngược lại
        // dưa con trỏ về cuối danh sách
        ListIterator<String> backIterator  = list.listIterator(list.size());
        System.out.println("duyệt bằng iterator theo chiều ngược lại");
        while (backIterator.hasPrevious()){
            System.out.print(backIterator.previous() + " ");
        }


    }
}
