// Design a method that returns true if element n is a member of given array  and false if not  by using the recursion .

package recursion;
class SearchElement
{
	public static int recSearch(int arr[], int l, int r, int x)
	{
		if (r < l)
			return -1;
		if (arr[l] == x)
			return l;
		if (arr[r] == x)
			return r;
		return recSearch(arr, l+1, r-1, x);
	}
	public static void main(String[] args)
	{
        int arr[]={12, 34, 54, 2, 3};
        int x=3;
		int index = recSearch(arr, 0, arr.length-1, x);
		if (index != -1)
        {
		System.out.println("True");
        }
		else
        {
		System.out.println("False");
		}
   }
}
