package Buoi8.Learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LearnCollection {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<>();
        /*  upcasting tham chiếu chuyển đổi lớp con lên lớp cha của nó, hoặc lớp giao diện mà nó thừa kế
         lúc này đối tượng chỉ sử dụng đc các lớp mà có ở lớp cha
          và nếu lớp con ghi đè phương thức đó thì khi sử dụng sẽ gọi đến phương thức của lớp con */
        collection.add("ha noi");
        collection.add("hue");
        collection.add("da nang");
        collection.add("Tphcm");
        // tạo một iterator để duyệt collection
        Iterator<String> iterator = collection.iterator();
        // hasnext kiêrm tra xem trong iterator có phần tử tiếp theo hay không
        while (iterator.hasNext()){
            System.out.print(iterator.next() +", ");
        }
        System.out.println();
        System.out.println(collection.size());
        System.out.println(collection.contains("hue"));
        Collection <String> collection1 = new ArrayList<>();
        collection1.add("Hung Yen");
        collection1.add("Hai duong");
        /*System.out.println(collection.retainAll(collection1));*/
        /**
         * do vòng while bên trên đã đưa con trỏ iterator đến cuối danh sách nên cần phải đưa con trỏ về đầu danh sách bằng cách  iterator = collection.iterator();
         */
        iterator = collection.iterator();
        System.out.println(iterator.next());
       /* collection.forEach(city -> System.out.println(city + " "));*/


    }
}
