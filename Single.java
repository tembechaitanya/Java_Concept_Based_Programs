
class Base
{
    public int A, B;

    public Base()
    {
        System.out.println("Inside Base Class Constructor");
        this.A = 10;
        this.B = 20;
    }

    public void fun()
    {
        System.out.println("Inside Base class fun function");
    }

    public void fun(int No)
    {
        System.out.println("Inside Base class fun function with one integer");
    }    
}

class Derived extends Base
{
    public int X, Y;

    public Derived()
    {
        System.out.println("Inside Derived class constructor");
        this.X = 30;
        this.Y = 40;
    }

    public void sun()
    {
        System.out.println("Inside sun of Derived class");
    }
}

class Single
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived();
        bobj.fun();
        bobj.fun(10);
        bobj.sun();
    }
}