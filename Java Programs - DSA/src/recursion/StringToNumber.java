// Write a recursive function to convert a given string into the number it represents.
// That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer. 

package recursion;
import java.util.Scanner;
public class StringToNumber
{
    String str;
    int num;
    Scanner sc = new Scanner(System.in);
    StringToNumber()
    {
        System.out.println("Enter number : ");
        str = sc.next();
    }
    public int convertStringToNumber(String s)
    {
        if (s.length()==0)
        {
            return num;
        }
        num = (int) ((num) + (Integer.parseInt(s.substring(0,1))*Math.pow(10,s.length()-1)));
        return convertStringToNumber(s.substring(1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringToNumber obj = new StringToNumber();
        System.out.println("Number  = " + obj.convertStringToNumber(obj.str));
    }
}