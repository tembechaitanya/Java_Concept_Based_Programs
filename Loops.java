

class Loops
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("\nTraversal of for loop : ");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("\nTraversal of while loop : ");
        iCnt = 0;
        while(iCnt<Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }

        System.out.println("\nTraversal of do while loop : ");
        iCnt = 0;
        do
        {
            System.out.println(Arr[iCnt]);
            iCnt++;  
        }while(iCnt<Arr.length);

        System.out.println("\nTraversal of for each loop : ");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }


    }
}