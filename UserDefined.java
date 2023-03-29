import java.util.*;

class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super(str);
    }
}

class UserDefined
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                AgeInvalidException aobj = new AgeInvalidException("Your Age is less than 15...");
                throw aobj;
            }
            else
            {
                System.out.println("age is valid");
            }
        }
        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }
    }
}