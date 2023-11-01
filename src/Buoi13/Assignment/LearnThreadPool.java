package Buoi13.Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnThreadPool {
    public static void main(String[] args) {
        /**
         * Executor để thực thi các tác vụ
         * còn ExecutorService để quản lý và kiểm soát các tác vụ
         * giao diện ExecutorService extends lại giao diện Executor và thêm các phương thức
         * shutdown() tắt các executor nhưng chờ các tác vụ hoàn thành mới tắt
         * shutdownNow() tắt ngay executor ngay cả khi các tác vụ đang được thực hiện và trả về danh sách tác vụ đang được thực hiện
         * isShutdown trả về true nếu executor đã tắt
         * isTerminated trả về true nếu TẤT CẢ các tác vụ trong pool đã kết thúc
         */
        // tạo ExecutorService để quản lí các task
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new PrintNum(100));
        executorService.execute(new PrintChar('a',100));
        executorService.execute(new PrintChar('b',100));
        executorService.shutdownNow();

    }
}
