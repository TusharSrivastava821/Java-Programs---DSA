// A child is running up a staircase with N steps and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count how many possible ways the child can run-up to the stairs.
// You need to return the number of possible ways W.

import java.util.*;
public class Staircase 
{
	public static int findStep(int n)
	{
		if ( n == 0)
			return 1;
		else if (n < 0)
			return 0;
		else
			return findStep(n - 3) + findStep(n - 2)+ findStep(n - 1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println(findStep(n));
	}
}
