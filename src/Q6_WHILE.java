import java.lang.*;
public class Q6_WHILE
{
    public static void main(String[] args)
    {
        int num=1;
        //Checks the test condition from begining , unlike do-while loop. Hence more efficient
        while(num<=10)
        {
            System.out.println(num);
            num=num+1;
        }
    }
}
