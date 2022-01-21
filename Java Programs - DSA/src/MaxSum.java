// You are given an array of integers and an integer k, your task is to calculate the maximum sum of 'k' consecutive elements in that array.
// If the size of array is less than k then print -1.

import java.util.Scanner;
public class MaxSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        System.out.print("k : ");
        int k = sc.nextInt();
        int tempSum = 0, sumArraySize = 0;
        if(k > size)
        {
            System.out.println("-1");
        }
        else
        {
            int max = 0;
            int[] arr = new int[size];
            int[] sumArray = new int[100];
            System.out.println("Enter array elements : ");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++)
            {
                sumArraySize++;
                tempSum = 0;
                for (int j = i; j < k+i; j++)
                {
                    if(k+i<=arr.length)
                        tempSum += arr[j];
                }
                sumArray[i] = tempSum;
            }
            max = sumArray[0];
            for (int i = 1; i < sumArraySize; i++)
            {
                if (sumArray[i] > max)
                    max = sumArray[i];
            }
            System.out.println("Maximum Sum = " + max);
        }
    }
}
