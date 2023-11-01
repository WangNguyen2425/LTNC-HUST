package Buoi13.Assignment;
public class LearnThread {
    public static void main(String[] args) throws InterruptedException {

        /** Task là nhiệm vụ cần được thực thi. mỗi task có thể được thực thi bởi 1 hoặc nhiều luôngf
         * Thread là đơn vị thực thi
         *
         * join là để thread đó join vào luồng chạy và chạy hết thread đó các thread khác mới chạy tiếp. đây là trong máy tính đơn lõi
         *
         * Thread có 2 phương thức tĩnh sleep và yield
         * tùy thuộc vào hệ diều hành yield có thể không có tác dụng. yeild nếu hoạt động là sẽ dừng thread đó và để các thread khác chạy hết thread gọi yield mới chạy
         * Thread.sleep có tác dụng là cho sleep nghi trong 1 khoảng thời gian. và trong khoảng thời gian đó các thread khác sử dụng cpu chạy bình thường
         * mực độ ưu tiên priofity cao không đồng nghĩa với việc nó sẽ chạy trước. priofity chỉ là GỢI Ý cho hệ điêù hành nên chọn thread nào để chaạy
         *
         * trong các máy tính chạy cpu đơn lõi thì các thread sẽ cpu sẽ chạy lần lượt các phần nhỏ của thread theo giải thuật round robin
         * nhưng trong máy tính đa lõi trong trường hợp số thread ít hơn số lõi thì mỗi thread sẽ được giao cho 1 lõi chạy do vai trò của các lõi là như nhau
         * khi thread nhiều hơn lõi thì 1 số lõi quay lại trường hợp như máy tính đơn lõi
         */
        System.out.println("main start");
       /* Runnable print100 = new PrintNum(10);
        Thread thread3 = new Thread(print100);
        thread3.start();*/
        Runnable printB = new PrintChar('b',10);
        Thread thread2 = new Thread(printB);
        thread2.start();
      //  thread3.join();

        thread2.join();
        System.out.println("\nmain stop");



    }

}
