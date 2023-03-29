import java.util.*;


class INPUT1
{
    public static void main(String h[])
    {
        Scanner sobj = new Scanner(System.in);
        float iNo1 = 0.0f;
        float iNo2 = 0.0f;
        float iAns = 0.0f;

        System.out.println("enter number:");
        iNo1 = sobj.nextFloat();
        System.out.println("enter number:");
        iNo2 = sobj.nextFloat();
        iAns = iNo1 + iNo2;
        System.out.println("Addition is : " + iAns);


        
    }

}