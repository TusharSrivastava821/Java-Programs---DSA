// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

class ArrayRotation
{
	void leftRotate(int arr[], int d, int n)
	{
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}
	void leftRotatebyOne(int arr[], int n)
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
        {
          arr[i] = arr[i + 1];
        }
		arr[n-1] = temp;
	}
	void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
        System.out.println();
	}
	public static void main(String[] args)
	{
		ArrayRotation obj = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int size=arr.length;
        System.out.println("Original Array:-");
        obj.printArray(arr,size);
		obj.leftRotate(arr, 2, size);
        System.out.println("Rotated Array:-");
		obj.printArray(arr, size);
	}
}

