
class Hello
{
    public void gun()
    {
        System.out.println("Inside gun of Hello..");
    }
}

class Demo extends Hello
{
    public void fun()
    {
        System.out.println("Inside fun of Demo..");
    }
}

class Combination2 extends Demo
{
    public static void main(String A[])
    {
        System.out.println("Example of Multi Level Inheritance..");

        Combination2 cobj = new Combination2();
        cobj.fun();
        cobj.gun();
        
    }
}