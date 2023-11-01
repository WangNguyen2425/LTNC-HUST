package Buoi8.Learn;

import java.util.LinkedList;
import java.util.Queue;

public class LeanQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("ha noi");
        queue.offer("hue");
        queue.offer("ho chi minh");
        queue.offer("Da nang");
        while (queue.size() > 0 ){
            System.out.println("size = " + queue.size());
            System.out.println("remove " + queue.remove());
            System.out.println("remain " + queue.toString());
        }
    }
}
