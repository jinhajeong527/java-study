package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d"); // rear of the queue
        // d -> b -> a -> c
        String front = queue.peek(); // 없으면 null 반환한다.
        System.out.println(front);

        queue.element(); // 없으면 예외 던진다.

        String poll = queue.poll(); // return null when queue is Empty
        System.out.println(poll);

        String removed = queue.remove(); // 없으면 예외던진다.
        System.out.println(removed);


    }
}
