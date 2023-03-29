import java.util.*;

class Arithmatic
{
    public int Ans;
    public int Divide(int iVal1, int iVal2)
    {
        try
        {
            Ans = iVal1 / iVal2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Reason behind exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Aisa koi karta hai kya Gandu..");
        }
        
        return Ans;        

    }
}

class Example
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter First number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("\nEnter Second number : ");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        int Ret = aobj.Divide(iNo1, iNo2);

        System.out.println("Answer is : " + Ret);


    }
}