package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDequeExample {
    public static void main(String[] args) {
        // Sử dụng LinkedList để tạo Queue
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào Queue
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("cherry");

        // In Queue ban đầu
        System.out.println("Queue ban đầu:");
        System.out.println(queue);

        // Loại bỏ phần tử đầu tiên khỏi Queue
        String removedElement = queue.poll();
        System.out.println("\nPhần tử đầu tiên đã bị loại bỏ: " + removedElement);

        // In Queue sau khi loại bỏ
        System.out.println("\nQueue sau khi loại bỏ:");
        System.out.println(queue);

        // Sử dụng ArrayDeque để tạo Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Thêm phần tử vào đầu Deque
        deque.offerFirst(10);
        deque.offerFirst(20);
        deque.offerLast(5);

        // In Deque ban đầu
        System.out.println("\nDeque ban đầu:");
        System.out.println(deque);

        // Sửa đổi phần tử đầu Deque
        deque.pollFirst();
        deque.offerLast(15);
        System.out.println("\nDeque sau khi sửa đổi:");
        System.out.println(deque);
    }
}

