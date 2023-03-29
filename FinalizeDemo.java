
class Demo
{
    public int Size;
    public int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside parameterised constructor!");

        Size = No;
        Arr = new int[Size];
    }

    protected void Finalize()
    {
        System.out.println("Inside Finalize !");
        Arr = null;
    }
}

class FinalizeDemo
{
    public static void main(String Ar[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
}