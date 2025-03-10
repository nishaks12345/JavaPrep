//import java.util.*;
//
//public class ReverseLinkedList
//{
//    public static ListNode reverseList(ListNode head)
//    {
//        ListNode current = head;
//        ListNode previous=null;
//        while(current!=null)
//        {
//            ListNode temp= current.next;
//            current.next = previous;
//            previous = current;
//            current=temp;
//        }
//        return previous;
//    }
//    // Driver code
//    public static void main(String[] args) {
//
//        // Create a hard-coded linked list:
//        // 1 -> 2 -> 3 -> 4 -> 5
//        ListNode node1 = new ListNode(10);
//        ListNode node2 = new ListNode(20);
//        ListNode node3 = new ListNode(30);
//        node1.next = node2;
//        node2.next = node3;
//        // Print the original linked list
//        System.out.print("Given Linked list:");
//        printList(node1);
//
//        // Function call to return the reversed list
//        head = reverseList(node1);
//
//        // Print the reversed linked list
//        System.out.print("\nReversed Linked List:");
//        printList(head);
//    }
//    public static void printList(ListNode node) {
//        while (node != null) {
//            System.out.print(" " + node.data);
//            node = node.next;
//        }
//    }
//
//}
//
