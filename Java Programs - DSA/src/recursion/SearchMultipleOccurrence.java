// Create an array of 5 elements with values {1,7,4,7,6}.
// Search value 7 in the given array and print all the occurrence(index) of search value(7) by holding the index in a result array .
// Do it recursively.

package recursion;
import java.util.Scanner;
public class SearchMultipleOccurrence
{
    int[] arr,resArr;
    int size,index;
    Scanner sc = new Scanner(System.in);
    SearchMultipleOccurrence()                             
    {
        System.out.println("Size of Array : ");
        size = sc.nextInt();                               
        arr = new int[size];                             
        resArr = new int[size];                           
    }
    public void setArr()                              
    {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public int[] res(int[] arr, int currentIndex, int searchValue)
    {
        if(currentIndex < arr.length)
        {
            if (searchValue == arr[currentIndex])          
            {
                resArr[index] = currentIndex;
                index++;
            }
            return res(arr, currentIndex + 1, searchValue);
        }
        return resArr;
    }
    public static void main(String[] args)                                
    {
        SearchMultipleOccurrence obj = new SearchMultipleOccurrence();
        Scanner sc = new Scanner(System.in);
        obj.setArr();
        int searchElement;
        System.out.println("Enter Search Element : ");
        searchElement = sc.nextInt();
        for (int i = 0; i < obj.index; i++)
        {
            System.out.println(obj.resArr[i]);                      
        }
    }
}
