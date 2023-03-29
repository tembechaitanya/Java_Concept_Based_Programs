import java.util.*;

class Arithmaic
{
    int Divide(int iVal1, int iVal2) throws ArithmaticException
    {
        int iRet = iVal1 / iVal2 ;
        return iRet;
    }
}   

class DivideProblem
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter 2nd number : ");
        int iNo2 = sobj.nextInt();

        Arithmaic aobj = new Arithmaic();

        try
        {
            int iAns = aobj.Divide(iNo1, iNo2);
            System.out.println("Answer is : " + iAns);
        }

        catch(ArithmaticException obj)
        {
            System.out.println(obj);
        }
    }
}