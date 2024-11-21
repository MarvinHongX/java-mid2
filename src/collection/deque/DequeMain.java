package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // stack: 앞에서 넣고 앞에서 꺼냄
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pollFirst());
        System.out.println("deque.pop() = " + deque.pollFirst());
        System.out.println("deque.pop() = " + deque.pollFirst());

        // stack: push, pop으로 넣고 꺼내면 기본값이 스택
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());

        // queue: 뒤에서 넣고 앞에서 꺼냄
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pollFirst());
        System.out.println("deque.pop() = " + deque.pollFirst());
        System.out.println("deque.pop() = " + deque.pollFirst());

        // queue: offer, poll로 넣고 꺼내면 기본값이 큐
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());

    }
}
