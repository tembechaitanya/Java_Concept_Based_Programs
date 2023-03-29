

class Static_Demo1
{
    static
    {
        System.out.println("\nHelllo : from static");
    }
    public Static_Demo1()
    {
        System.out.println("Hello : from constructor");
    }

    public static void main(String A[])
    {
        static
        {
            System.out.println("\nHelllo : from static");
        }         
        Static_Demo1 sd = new Static_Demo1();       
    }
}