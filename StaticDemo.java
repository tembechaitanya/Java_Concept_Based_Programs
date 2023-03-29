

class Demo
{
    public int No1;
    public int No2;
    public static int No3;
    public static int No4;

    static
    {
        System.out.println("\nInside static block of Demo class");
        No3 = 30;
        No4 = 40;
    }
    public Demo()
    {
        No1 = 10;
        No2 = 20;
    }
    public void gun()
    {
        System.out.println("Inside Demo :: gun");
        System.out.println("No1 : " + this.No1);
        System.out.println("No2 : " + this.No2);
        System.out.println("No3 : " + this.No3);
        System.out.println("No4 : " + this.No4);

    }
    public static void sun()
    {
        System.out.println("Inside Demo :: sun");
        System.out.println("No3 : " + No3);
        System.out.println("No4 : " + No4);
    }

}


class StaticDemo
{
    static
    {
        System.out.println("\nFirst preference to : static keyword in main!");
    }

    public StaticDemo()
    {
        System.out.println("Third preference to : constructor of class in main");
    }

    public void fun()
    {
        System.out.println("fourth preference to : another function in main");
    }

    public static void main(String Ags[])
    {
        System.out.println("Second preference to : main function");
        StaticDemo sobj = new StaticDemo();
        sobj.fun();

        Demo dobj = new Demo();
        dobj.gun();
        dobj.sun();

    }

}