
class Math
{
    public int Val1;
    public int Val2;

    public Math()
    {
        Val1 = 0;
        Val2 = 0;
        System.out.println("Inside default constructor");
    }
    public Math(int A, int B)
    {
        Val1 = A;
        Val2 = B;
        System.out.println("Inside parameterised constructor");
    }

    public int Addition()
    {
        System.out.println("Inside Addition function");
        int iAns = 0;
        iAns = Val1 + Val2;
        return iAns;
    }

    
}


class Demo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        int iRet = 0;

        Math obj1 = new Math();
        Math obj2 = new Math(10,11);

        iRet = obj2.Addition();
        System.out.println("Addition is : " + iRet);

        Math M1 = obj1;
        Math M2 = obj2;

        // M1.Addition();
        // System.out.println("Addition is : " + iRet);

        M2.Addition();
        System.out.println("Addition is : " + iRet);



        
    }
}