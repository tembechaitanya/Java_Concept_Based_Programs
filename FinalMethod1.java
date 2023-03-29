class Base
{
    public void fun()
    {
        System.out.println("Class Base :: method fun");
    }
    public final void gun()
    {
        System.out.println("Class Base :: method final gun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Class Derived :: method fun");  //Disply this on screen as override
    }      

    public void gun()
    {
        System.out.println("Class Derived :: method final gun");    //can't override
    }
}

class FinalMethod1 extends Base
{
    public static void main(String A[])
    {
        Base bobj = new Derived();
        bobj.fun();
        bobj.gun();
    }
}