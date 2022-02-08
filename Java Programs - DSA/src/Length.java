// For a given singly linked list of integers, find and return its length. 
// Do it using an iterative method.

class Node
{
	int data;
	Node next;
	Node(int d) 
    { 
       data = d; 
       next = null; 
    }
}
class LinkedList
{
	Node head;
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public int getCount()
	{
		Node temp = head;
		int count = 0;
		while (temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
}
class LinkedListMain
{
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		llist.push(3);
		llist.push(2);
		llist.push(5);
		llist.push(7);
		llist.push(2);
		System.out.println("Count of nodes is " +llist.getCount());
	}
}


