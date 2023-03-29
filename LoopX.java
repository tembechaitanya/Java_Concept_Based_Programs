  

class LoopX
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40,50};

        System.out.println("\nSize of Array is : " + Arr.length);

        System.out.println("\nTraversal by for loop :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);   
        }      

        System.out.println("\nTraversal by while loop : ");
        int iCnt = 0;
        while(iCnt < Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }

        System.out.println("\nTraversal by do-while loop : ");
        iCnt = 0;
        do
        {
            System.out.println(Arr[iCnt]);
            iCnt++;


        }while(iCnt < Arr.length);

        System.out.println("\nTraversal by for each loop : ");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }

    }
}