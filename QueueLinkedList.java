package com.prep;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueLinkedList implements Iterable<Integer>
{
	private Node front;private Node rear;

	QueueLinkedList()
	{
		this.front=this.rear=null;
	}
	public void enqueue(int data)
	{
		Node newNode=new Node(data);
		if(rear==null)
		{
			front=rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue()
	{
		if(front==null)
		{
			return -1;
		}else
		{
			int dequeuedData = front.data;
			front = front.next ;
			if(front==null)
			{
				rear=null;
			}
			return dequeuedData;
		}
	}
	public int peek()
	{
		if(front==null)
		{
			return -1;
		}
		else
		{
			return front.data;
		}
	}
	
	public void display()
	{
		Node tmp=front;
		while(tmp!=null)
		{
			System.out.print(tmp.data);
			tmp=tmp.next;
		}
		
	}
	@Override
	public Iterator<Integer> iterator() 
	{
		return new QueueIterator(front);

	}
    private class QueueIterator implements Iterator<Integer> {
        private Node current;
        
        public QueueIterator(Node front) {
            this.current = front;
        }
        
        @Override
        public boolean hasNext() {
            return current != null;
        }
        
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int data = current.data;
            current = current.next;
            return data;
        }
    }


	    public static void main(String[] args) {
	    	QueueLinkedList queue = new QueueLinkedList();
	        
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.display();
	        
	        System.out.println("Front element is: " + queue.peek());
	        System.out.println("Dequeued element: " + queue.dequeue());
	        queue.display();
	        
	        System.out.println("Iterating through queue:");
	        for (int value : queue) {
	            System.out.println(value);
	        }
	    }
	
}
