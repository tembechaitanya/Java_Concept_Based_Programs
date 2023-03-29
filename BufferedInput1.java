import java.io.*;

class BufferedInput1
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);

        BufferReader bobj = new BufferReader(iobj);

        String Name = null;
        int Age = 0;
        float Marks = 0.0f;

        try
        {
            System.out.println("\nEnter Name : ");
            Name = bobj.readLine();

            System.out.println("Enter your Age : ");
            Age = Integer.parseInt(bobj.readLine());

            System.out.println("Enter your marks : ");
            Marks = Float.parseFloat(bobj.readLine());
        }

        catch(IOException obj)
        {

        }

        System.out.println("Name is : " + Name);
        System.out.println("Age is : " + Age);
        System.out.println("Marks is : " + Marks);

    }
}