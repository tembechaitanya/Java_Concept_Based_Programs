 import java.lang.*;

class Demo
{
    public void fun()
    {
        System.out.println("fun with no parameter");
    }
    public void fun(int A)
    {
        System.out.println("fun with one integer parameter");
    }
    public void fun(double B, double C)
    {
        System.out.println("fun with two double parameters");
    }
}

 class Overloading
 {
    public static void main(String Args[])
    {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(1);
        obj.fun(10.20,20.30);
    }
 }