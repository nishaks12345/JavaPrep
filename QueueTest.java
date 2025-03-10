package com.prep;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String args[])

    {
    	Queue<String> queue = new LinkedList<>();
    	queue.offer("aaa0");
    	queue.offer("aaa1");queue.offer("aaa2");
    	queue.offer("aaa3");
    	System.out.println("Queue: " + queue);
    	System.out.println("Queue: " + queue.peek());
    	System.out.println("Queue: " + queue.poll());
    	System.out.println("Queue: " + queue);

    }

}
