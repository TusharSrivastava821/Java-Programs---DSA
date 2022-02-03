// Print all the permutations of the given string "abc".

public class Permutation
{
    public static void ans(String inp,String ans)
    {
        if(inp.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<inp.length();i++)
        {
            String remainingString=inp.substring(0,i)+inp.substring(i+1);
            char extract=inp.charAt(i);
            ans(remainingString,ans+extract);
        }
    }
    public static void main(String[] args)
    {
        ans("abc"," ");
    }
}