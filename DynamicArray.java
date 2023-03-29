import java.util.*;

class DynamicArray
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter the size of array : ");
        int iSize =  sobj.nextInt();

        int Arr[] = new int [iSize];    //define Array size 

        System.out.println("\nNumber of elements in array is : " + Arr.length);

        System.out.println("\nEnter the elements of array: ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("\nNumbers in the array are :");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("\nSum of all the elements in array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.println(iSum);

    }
}