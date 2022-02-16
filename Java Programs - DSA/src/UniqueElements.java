// In a sorted linked list (elements are sorted in ascending order), 
// eliminate duplicates from the given linked list, 
// such that output linked list contains only unique elements. 

class UniqueElements
{
	Node head; 
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
	void removeDuplicates()
	{
		Node curr = head;
		while (curr != null) 
		{
			Node temp = curr;
			while(temp!=null && temp.data==curr.data) 
            {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		UniqueElements obj = new UniqueElements();
		obj.push(40);
		obj.push(35);
		obj.push(23);
		obj.push(23);
		obj.push(15);
		obj.push(15);
		System.out.println("List before removal of duplicates");
		obj.printList();
		obj.removeDuplicates();
		System.out.println("List after removal of elements");
		obj.printList();
	}
}
