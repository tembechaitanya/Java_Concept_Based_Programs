
class Demo
{
    public void fun()
    {
        System.out.println("Inside fun of Demo..");
    }
}

class Combination1 extends Demo
{
    public static void main(String A[])
    {
        System.out.println("Example of Single Level Inheritance..");

        Combination1 cobj = new Combination1();
        cobj.fun();

        Demo dobj = new Demo();
        dobj.fun();
    }
}