

class Example
{
    public static void main(String A[])
    {
        try
        {
            throw new ClassNotFoundException();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Changed name of your class");
        }

    }
}