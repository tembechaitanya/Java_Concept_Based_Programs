
class Static_Demo
{
    static
    {
        System.out.println("\nInside Static_Demo class, which have main function in it");
    }

    public static void main(String A[])
    {
        System.out.println("Value of No3 (static) : " + Demo.No3);
        System.out.println("Value of No4 (static) : " + Demo.No4);       

        Demo.gun();   //gun was staic method that's why we don't need to create object of Demo class

        Demo dobj = new Demo();
        dobj.fun();  //fun was non static method that's why we have to create object of Demo class
    }
}

class Demo
{
    public int No1;             // non static characteristic
    public int No2;             // non static characteristic
    public static int No3;      // static characteristic
    public static int No4;      // static characteristic

    static
    {
        System.out.println("\nInside static block of Demo class to initialize static characters");

        No3 = 51;
        No4 = 101;
    }

    public Demo()
    {
        System.out.println("\nInside constructor of Demo class to initialize non static characters");

        No1 = 11;
        No2 = 21;
    }

    public void fun()
    {
        System.out.println("Inside non static fun method : Access static & non static characters");

        System.out.println("Value of No1 : " + this.No1);
        System.out.println("Value of No2 : " + this.No2);
        System.out.println("Value of No3 : " + this.No3);
        System.out.println("Value of No4 : " + this.No4);
    }

    public static void gun()
    {
        System.out.println("Inside static gun method : Access only static charaters");
        //We can not use here now this keyword to access the characters of static block

        System.out.println("Value of No3 : " + No3);
        System.out.println("Value of No4 : " + No4);

    }


}