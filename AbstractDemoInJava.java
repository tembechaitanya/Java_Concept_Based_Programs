
abstract class Arithmatic
{
    public int Addition(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }

    public abstract int Subtration(int iNo1, int iNo2);

}

class Marvellous extends Arithmatic
{
    public int Subtration(int iNo1, int iNo2)
    {
        return iNo1 - iNo2;
    }
}

class AbstractDemoInJava
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        int iRet =0;

        iRet = mobj.Addition(11,10);
        System.out.println("Addition is : " + iRet);

        iRet = mobj.Subtration(11,10);
        System.out.println("Subtration is : " + iRet);

    }
}