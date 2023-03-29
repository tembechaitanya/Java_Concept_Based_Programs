import java.util.Scanner;

class ArrayAddition
{
    public static void main(String Args[])
    {
        Scanner sobj =  new Scanner(System.in);
        int iSize = 0;
        

        System.out.println("Enter the size of elements:");
        iSize = sobj.nextInt();

        System.out.println("Enter the elements of mentioned size :");
        int Arr[] = new int[iSize];
        for(int iCnt = 0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
            // Arr[0] = sobj.nextInt();
            // Arr[1] = sobj.nextInt();
            // Arr[2] = sobj.nextInt();
            
        }

        System.out.println("Elements which mentioned :");
        for(int iCnt = 0; iCnt<iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Addition is : ");
        int iSum = 0;
        for(int iCnt = 0; iCnt<iSize ; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.println(iSum);

        
            


    }
}