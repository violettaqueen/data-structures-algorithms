package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask1 {

    /*
    Build a queue using a linked list from scratch. Implement the following operations.
    -enqueue -dequeue -peek -size -isEmpty
     */

    public static void main(String[] args) {

        // 1.make a regular Linked List: Head and Tail

        /*
        1. Given an integer K and a queue of integers, write code to reverse the order of the first K elements of the queue.
        -Input: Q = [10, 20, 30, 40, 50], K = 4 -Output: Q = [40,30, 20, 10,50]
        Hint: You can use stack to reverse the order of first K elements
         */

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println(myQueue.dequeue());
        //System.out.println(myQueue.dequeue());

        Queue<Integer> cq = new LinkedList<>();
        cq.add(1);
        cq.add(3);
        System.out.println(cq.remove());

    }
}
