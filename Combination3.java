
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

class Combination3 extends Hello
{
    public static void main(String A[])
    {
        System.out.println("Example of Hirarchal Inheritance..");

        Combination3 cobj = new Combination3();
        
        cobj.gun();
        
    }
}