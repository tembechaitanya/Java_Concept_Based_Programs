import java.util.Scanner;

class ScannerX
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("\nEnter First number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addtion is : " + iAns);
    }

}