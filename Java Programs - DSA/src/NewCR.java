//  Who will become the CR?
// Vishal and Pankaj are contesting for the class representative elections. Pankaj wants to prove that he is
// much more intelligent than Vishal. So, he challenges Vishal for a guessing game.
// In this game, Pankaj has three cups and a small ball. He puts three cups on a table, all upside down.
// Initially, the ball is kept in leftmost cup. He makes one of the following three swaps (for better
// comprehension, let us index leftmost cup as 1, middle cup as 2 and rightmost cup as 3):
// 1. Swap Strategy A: He swaps cups with index 1 and 2
// 2. Swap Strategy B: He swaps cups with index 2 and 3
// 3. Swap Strategy C: He swaps cups with index 1 and 3
// ---------------------------------------------------------------------------------------------------------------
// (Leftmost) Cup1		(Middle) Cup2		(Rightmost) Cup3
//      1    		      2                    3
// ---------------------------------------------------------------------------------------------------------------
// Vishal needs your help. Can you predict the position of ball's cup, if you given all he swap movements
// made by Pankaj.

public class NewCR
{
    int[] posArr;
    NewCR()
    {
        posArr = new int[3];
        posArr[0] = 1;
    }
    public static void main(String[] args)
    {
        NewCR obj = new NewCR();
        String s = "CBABCACCC";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            switch (c)
            {
                case 'A' :
                {
                    int temp = obj.posArr[0];
                    obj.posArr[0] = obj.posArr[1];
                    obj.posArr[1] = temp;
                }
                case 'B' :
                {
                    int temp = obj.posArr[1];
                    obj.posArr[1] = obj.posArr[2];
                    obj.posArr[2] = temp;
                }
                case 'C' :
                {
                    int temp = obj.posArr[0];
                    obj.posArr[0] = obj.posArr[2];
                    obj.posArr[2] = temp;
                }
            }
        }
        for (int i = 0; i < obj.posArr.length; i++)
        {
            if (obj.posArr[i] == 1)
                System.out.println(i+1);
        }
    }
}
