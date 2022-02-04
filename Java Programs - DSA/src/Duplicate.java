// Write a program to find whether the array of integers contains a duplicate number. 
// If yes print the location where duplicate numbers are found.

import java.util.Scanner;  
public class Duplicate 
{  
    public static void main(String[] args) 
    {      
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt(); 
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
         arr[i]=sc.nextInt();  
        }  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < n; i++) {  
            for(int j = i + 1; j < n; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println("Element:-"+arr[j]+" "+"Found at index="+j);  
            }  
        }  
    }  
}  