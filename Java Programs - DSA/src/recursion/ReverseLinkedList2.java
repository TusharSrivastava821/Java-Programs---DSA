// You have been given a singly linked list of integers. 
// Write a function to print the list in a reverse order.

package recursion;
class ReverseLinkedList2
{
	static Node head; 
	static class Node 
    {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	static Node reverse(Node head)
	{
		if (head == null || head.next == null)
			return head;
		Node rest = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}
	static void print()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	static void push(int data)
	{
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
public static void main(String args[])
{
	push(10);
	push(24);
	push(3);
	push(55);
    push(34);
	System.out.println("Given linked list");
	print();
	head = reverse(head);
	System.out.println("Reversed Linked list");
	print();
}
}
