import java.util.*;


class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int Size)
    {
        this.iSize = Size;
        this.Arr =  new int[iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements According to size : ");
        for(int iCnt = 0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }        
    }
    public void Display()
    {
        System.out.println("Elements are : ");
        for(int iCnt = 0; iCnt<iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void Addition()
    {
        int iSum = 0;
        System.out.println("Addition is : ");
        for(int iCnt = 0; iCnt< iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.println(iSum);
    }
}


class ArrayByOOP
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int iSizeM = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSizeM);
        aobj.Accept();
        aobj.Display();
        aobj.Addition();
    }
}