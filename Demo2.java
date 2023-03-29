
class Math
{
    int Addition(int A,int B)
    {
        System.out.println("Inside Addition function...");
   
        int iNo1 = A;
        int iNo2 = B;
        int iAns = 0;
        
        iAns = iNo1 + iNo2;
        return iAns;
    }
}


class Demo2
{
    public static void main(String A[])
    {
        Math mobj = new Math();
        System.out.println("Inside main function...");
        int iRet = 0;

        iRet = mobj.Addition(10,11);
        System.out.println("Addition is : "+ iRet);
    }
}