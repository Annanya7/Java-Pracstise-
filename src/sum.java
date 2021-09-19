import java.lang.*;
public class sum
{
    public static void main(String[] args)
    {
        int a,b,sum=0;
        a=10;b=20;
        sum=a+b;
        // concatening a string and a numeric valuue
        System.out.println("sum of two numbers"+sum);
        /* concatenating two string values. Since the left value is a string , a is treated as a string "1" and "0" and so is b. so the result is as follows*/
        System.out.println("sum of two numbers"+ a+b);
        //Correcting the error
        System.out.println("sum of two numbers"+ (a+b));


    }
}
