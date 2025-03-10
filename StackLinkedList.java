package com.prep;

public class StackLinkedList 
{
	static Node top;


public StackLinkedList() 
{
	StackLinkedList.top=null;
}

private static void push(int data) 
{
	Node newNode = new Node(data);
	newNode.next= top;
	top=newNode;
	System.out.println(data + " pushed onto the stack.");
}

	private static int pop() 
	{
		if(top==null)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			int popData = top.data;
			top=top.next;
			return popData;
			
		}
	}

	private static int peek() 
	{
		
		if(top==null)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			return top.data;
		}
	}

	private static void display() 
	{
		Node tmp=top;
		if(tmp==null)
		{
			System.out.print("empty stack");
		}
		while(tmp.next!=null)
		{
			System.out.print(top.data+"->");
			tmp=tmp.next;
		}
		
	}



	public static void main(String args[])
	{
		
		

		StackLinkedList stack = new StackLinkedList();
        
		StackLinkedList.push(10);
		StackLinkedList.push(20);
		StackLinkedList.push(30);
		StackLinkedList.display();
        
        System.out.println("Top element is: " + StackLinkedList.peek());
        System.out.println("Popped element: " + StackLinkedList.pop());
        StackLinkedList.display();

	}
}

