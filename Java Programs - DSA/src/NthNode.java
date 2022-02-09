// For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

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
class NthNode 
{
	Node head;
	public int GetNth(int index)
	{
		Node current = head;
		int count = 0;
		while (current != null)
		{
			if (count == index)
				return current.data;
			count++;
			current = current.next;
		}
		assert (false);
		return 0;
	}
	public void push(int new_data)
	{
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		head = new_Node;
	}
	public static void main(String[] args)
	{
		NthNode obj = new NthNode();
		obj.push(1);
		obj.push(4);
		obj.push(1);
		obj.push(12);
		obj.push(1);
		System.out.println("Element at index 3 is "+ obj.GetNth(3));
	}
}
