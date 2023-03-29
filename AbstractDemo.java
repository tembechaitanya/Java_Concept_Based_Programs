
abstract class Arithmatic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substarction(int No1, int No2);
}

class Marvellous extends Arithmatic
{
    public int Substarction(int No1, int No2)
    {
        return No1 - No2;
    }
}

class AbstractDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        int Ret = 0;

        Ret = mobj.Addition(11,10);
        System.out.println("Addition is : " + Ret);

        Ret = mobj.Substarction(60,70);
        System.out.println("Substraction is : " + Ret);

    }
}