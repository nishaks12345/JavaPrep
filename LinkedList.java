package com.prep;

public class LinkedList 
{

	private Node head;
	public void insertAtBegin(int data)
	{
		
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAtEnd(int data)
	{
		
		Node newNode = new Node(data);
		Node tmp=head;
		while(tmp.next!=null)
		{
			tmp=tmp.next;
		}
		tmp.next=newNode;
	}
	
	public void printList() {
		
		Node tmp =head;
		while(tmp!=null)
		{
			System.out.print(tmp.data +" -> ");
			tmp=tmp.next;
		}
        System.out.println("NULL");
    }
	 // Insert a node at a specific index
    public void insertAt(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        Node newNode = new Node(data);

        // Insert at head (index 0)
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the node before the given index
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        // If index is greater than the size of the list
        if (temp == null) {
            System.out.println("Index out of bounds!");
        }
    }
	
	public static void main(String args[])
	{
		LinkedList ls = new LinkedList();
		ls.insertAtBegin(20);
		ls.insertAtBegin(21);
		ls.insertAtEnd(200);
		ls.insertAtPosition(100,2);
		ls.printList();
		
	}

	private void insertAtPosition(int val, int position) 
	{
		Node tmp = head;int count=0;
		Node newNode = new Node(val);
		while(tmp!=null&& count<=position)
		{
			count++;
			if(count==position)
			{
				 newNode.next = tmp.next;
			     tmp.next = newNode;
			}
		}
		
	}
}
