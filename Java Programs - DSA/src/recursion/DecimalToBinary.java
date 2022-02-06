// Write a recursive function to convert a decimal number into a binary number and print the binary number.

package recursion;
import java.util.*;
class DecimalToBinary
{
	static int find(int decimal_number)
	{
		if (decimal_number == 0)
        {
            return 0;
        }
		else
        {
            return (decimal_number % 2 + 10 *find(decimal_number / 2));
        }
	}
   public static void main(String args[]) 
   {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
	System.out.println(find(n));
   }
}



 

