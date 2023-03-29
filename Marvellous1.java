import java.util.*;

interface Demo
{
    int fun();
}

interface Hello extends Demo
{
    int gun();
}

class Marvellous1 implements Hello
{
    public static void main(String A[])
    {
        int fun()
        {
            System.out.println("Inside fun");
        }

        int gun()
        {
            System.out.println("Inside gun");
        }

    }
}