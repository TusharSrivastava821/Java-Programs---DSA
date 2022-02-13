// You have been given a singly linked list of integers.
// Write a function to print the list in a reverse order.

class ReverseLinkedList1
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
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) 
        {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	void printList(Node node)
	{
		while (node != null) 
        {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args)
	{
		ReverseLinkedList1 obj = new ReverseLinkedList1();
		obj.head = new Node(26);
		obj.head.next = new Node(15);
		obj.head.next.next = new Node(24);
		obj.head.next.next.next = new Node(71);
		System.out.println("Given Linked list");
		obj.printList(head);
		head = obj.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		obj.printList(head);
	}
}
