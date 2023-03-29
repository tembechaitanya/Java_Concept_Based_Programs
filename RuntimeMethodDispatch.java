
class Base
{
    public void fun()
    {
        System.out.println("Inside fun of Base class");
    }
    public void gun()
    {
        System.out.println("Inside gun of Base class");
    }
    public void sun()
    {
        System.out.println("Inside sun of Base class");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside fun of Derived class");
    }
    public void gun()
    {
        System.out.println("Inside gun of Derived class");
    }
    public void sun()
    {
        System.out.println("Inside sun of Derived class");
    }
}


class RuntimeMethodDispatch
{
    public static void main(String A[])
    {
        System.out.println("\nInside main function of RuntimeMethodDispatch class");
        Base bobj = new Derived();  //upcasting
        bobj.fun();
        bobj.gun();
        bobj.sun();
    }
    
}