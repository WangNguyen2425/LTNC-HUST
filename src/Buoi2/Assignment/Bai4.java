package Buoi2.Assignment;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Sử dụng lớp java.util.Date để viết chương trình tạo
 * đối tượng Ngày, đặt đối tượng đã qua thời gian đến 10000,
 * 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000 và 100000000000, và hiển thị ngày và giờ
 * bằng cách sử dụng phương thức toString() tương ứng.
 */
public class Bai4 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Hiện tại là ngày: "+ date.toString());
        // em chưa hiểu câu hỏi "đặt đối tượng đã qua đến thời gian" nên ở đây em làm theo 2 cách là so với hiện tại và so với Thu Jan 01 08:00:00 ICT 1970
        // so với hiện tại
        Map<String, Long> number = new HashMap<>(); // tạo một đối tượng map để tránh việc viết quá nhiều số 0 gây nhầm lẫn
        number.put("10k", 10000L);
        number.put("100k", 100000L);
        number.put("1m", 1000000L);
        number.put("10m", 10000000L);
        number.put("100m", 100000000L);
        number.put("1b", 1000000000L);
        number.put("10b", 10000000000L);
        number.put("100b", 100000000000L);
        date.setTime(date.getTime() + number.get("10k"));
        System.out.println("Sau " + String.valueOf(number.get("10k"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("100k"));
        System.out.println("Sau " + String.valueOf(number.get("100k"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("1m"));
        System.out.println("Sau " + String.valueOf(number.get("1m"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("100m"));
        System.out.println("Sau " + String.valueOf(number.get("100m"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("1b"));
        System.out.println("Sau " + String.valueOf(number.get("1b"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("10b"));
        System.out.println("Sau " + String.valueOf(number.get("10b"))+ " Mili giây so với hiện tại là ngày : " + date.toString());
        date.setTime(date.getTime() + number.get("100b"));
        System.out.println("Sau " + String.valueOf(number.get("100b"))+ " Mili giây so với hiện tại là ngày : " + date.toString());

        // so với Thu Jan 01 08:00:00 ICT 1970
        date.setTime(number.get("10k"));
        System.out.println("Sau " + String.valueOf(number.get("10k"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("100k"));
        System.out.println("Sau " + String.valueOf(number.get("100k"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("1m"));
        System.out.println("Sau " + String.valueOf(number.get("1m"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("100m"));
        System.out.println("Sau " + String.valueOf(number.get("100m"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("1b"));
        System.out.println("Sau " + String.valueOf(number.get("1b"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("10b"));
        System.out.println("Sau " + String.valueOf(number.get("10b"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
        date.setTime(number.get("100b"));
        System.out.println("Sau " + String.valueOf(number.get("100b"))+ " Mili giây so với so với 1/1/1970 08:00:00 ICT là ngày : " + date.toString());
    }

}
