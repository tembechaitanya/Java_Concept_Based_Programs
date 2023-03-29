
import java.util.*;

class Arithmatic
{
    public int Division(int A, int B) throws ArithmeticException
    {
        int Ans = 0;
        Ans = A / B;
        return Ans;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter number");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        try
        {
            int Ret = aobj.Division(iNo1, iNo2);
            System.out.println("Division is : " + Ret);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured of type : " + e.getMessage());
        }
    }
}