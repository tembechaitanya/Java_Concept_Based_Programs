
class Arithmatic
{
    public int iNo1 ;
    public int iNo2 ;
    public int iAns ;

    public Arithmatic()
    {
        System.out.println("Default constructor..");
        iNo1 = 0;
        iNo2 = 0;
        iAns = 0;
    }
    // public Arithmatic()
    // {
    //     System.out.println("parametrised constructor..");
    //     iNo1 = A;
    //     iNo2 = B;
    // }
    public int Addition(int A, int B)
    {
        //int iAns = 0;
        int iNo1 = A;
        int iNo2 = B;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Subtraction()
    {
        //int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}

class Demo
{
    public static void main(String A[])
    {
        System.out.println("Inside main...");
        Arithmatic aobj1 = new Arithmatic();        //aobj1 : this object for default constructor
       // Arithmatic aobj2 = new Arithmatic();        //aobj2 : this object for parametrised constructor

        int iRet = 0;
        iRet = aobj1.Addition(60,50);
        System.out.println("Addition is : " + iRet);

    }
}