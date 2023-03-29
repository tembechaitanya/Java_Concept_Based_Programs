
class Arithmatic
{
    public int iNo1;
    public int iNo2;
    
    Arithmatic()
    {
        System.out.println("\nInside Default constructor");

        iNo1 = 0;
        iNo2 = 0;
    }

    Arithmatic(int a, int b)
    {
        System.out.println("\nInside parametried constructor");

        iNo1 = a;
        iNo2 = b;
    }

    int Addition()
    {
        System.out.println("\nInside Addition function");
        int iAns = iNo1 + iNo2;
        return iAns;
    }
}

class Demo5
{
    public static void main(String A[])
    {
        System.out.println("\nInside main function");

        Arithmatic aobj1 = new Arithmatic();
        Arithmatic aobj2 = new Arithmatic(10,11);

        int iRet = aobj2.Addition();
        System.out.println("\nAddition is " + iRet);

    }
}