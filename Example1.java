
class Example1
{
    public static void main(String A[])
    {
        try
        {
            //System.out.println("Inside try block");
            System.out.println(3/0);
        }
        catch(ArithmaticException e)
        {
            System.out.println("You can't divide by 0 : " + e.getMessage());
        }
    }
}