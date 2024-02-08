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

// List 로 구현할수도 있다
public class ArrayQueue {
    int MAX = 1000;
    int front;    //머리 쪽에 위치할 index값, pop할때 참조하는 index
    int rear;    //꼬리 쪽에 위치할 index값, push할때 참조하는 index
    int [] queue;
    public ArrayQueue() {
        front = rear = 0;    //초기값 0
        queue = new int[MAX]; //배열 생성
    }

    public boolean queueisEmpty() { //queue에 아무것도 들어있지 않은지 판단하는 함수
        return front == rear;
    }
    public boolean queueisFull() {    //queue가 가득 차 공간이 없는지 판단하는 함수
        if(rear == MAX-1) {
            return true;
        }else 
            return false;
    }
    public int size() { //queue에 현재 들어가 있는 데이터의 개수를 return
        return front-rear;
    }
    public void push(int value) {
        if(queueisFull()) {
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++] = value; //rear가 위치한 곳에 값을 넣어주고 rear를 증가시킨다.
    }
    public int pop() {
        if(queueisEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front++];
        return popValue;
    }
    public int peek() {
        if(queueisEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front];
        return popValue;
    }
}
