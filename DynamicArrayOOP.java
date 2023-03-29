import java.util.*;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int no)
    {
        this.iSize = no;
        this.Arr = new int [iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter the elements : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("\nYou entered the elements : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Addition()
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class DynamicArrayOOP
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter the array size : ");
        int iSizeArr = sobj.nextInt();

        ArrayX obj1 = new ArrayX(iSizeArr);

        obj1.Accept();
        obj1.Display();

        int iRet = obj1.Addition();
        System.out.println("\nADDITION IS : " + iRet);

    }
}