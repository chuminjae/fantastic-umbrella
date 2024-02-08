// Enqueue와 Dequeue 추가/제거
//자바에서는 Queue class를 제공해준다.

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(1); // 1
        queue.offer(2); // 1 2
        queue.offer(3); // 1 2 3
        queue.offer(4); // 1 2 3 4
        queue.offer(5); // 1 2 3 4 5

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}