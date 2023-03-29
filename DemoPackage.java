import java.util.*;
import Marvellous.Arithmatic;

class DemoPackage
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1St number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter 2nd number : ");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1, iNo2);
        int iResult = aobj.Addition();

        System.out.println("Addition is : " + iResult);

    }
}