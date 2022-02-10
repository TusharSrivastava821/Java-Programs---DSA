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
class Length
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
	public static void main(String[] args)
	{
		Length obj = new Length();
		obj.push(4);
		obj.push(2);
		obj.push(5);
		obj.push(7);
		obj.push(5);
		System.out.println("Count of nodes is " +obj.getCount());
	}
}
