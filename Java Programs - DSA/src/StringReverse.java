// Write a program to reverse string alongside the midpoint.

class Node1
{
    char data;
    Node1 next;
    Node1(char data)
    {
        this.data = data;
    }
}
public class StringReverse
{
    Node1 front,rear;
    StringReverse()
    {
        front = rear = null;                          
    }
    public boolean isEmpty()
    {
        return (front == null || rear == null);   
    }                               
    public void enQueue(char data)                      
    {
        if (isEmpty())
        {
            Node1 newNode = new Node1(data);
            front = rear = newNode;
        }
        else
        {
            Node1 newNode = new Node1(data);
            rear.next = newNode;
            rear = rear.next;
        }
    }
    public void printQueue(Node1 front)                  
    {
        Node1 temp = front;
        System.out.println(temp.data);
        temp = temp.next;
    }
    public String reverseByMidpoint(String str)     
    {                                                 
        int midpoint;
        if (str.length()%2 == 0)
        {
            midpoint = str.length()/2 - 1;
        }
        else
        {
            midpoint = (int) str.length()/2;
        }
        System.out.println(midpoint);
        StringBuilder initial = new StringBuilder(str.substring(0,midpoint));
        String mid = str.substring(midpoint,midpoint+1);
        StringBuilder end = new StringBuilder(str.substring(midpoint+1));
        initial.reverse();
        end.reverse();
        return initial.toString() + mid + end.toString();
    }
    public static void main(String[] args)
    {
        StringReverse[] testString = new StringReverse[args.length];
        for (String arg : args)
        {
            System.out.println(arg);
        }
        for (int i = 0; i < args.length; i++)
        {
            testString[i] = new StringReverse();
        }
        for (int i = 0; i < args.length; i++)
        {
            args[i] = testString[i].reverseByMidpoint(args[i]);
        }
        for (int i = 0; i < args.length; i++)
        {
            for (int j = 0; j < args[i].length(); j++)
            {
                testString[i].enQueue(args[i].charAt(j));
            }
        }
        for (int i = 0; i < args.length; i++)
        {
            for (int j = 0; j < args[i].length(); j++)
            {
                testString[i].printQueue(testString[i].front);
            }
        }
    }
}
