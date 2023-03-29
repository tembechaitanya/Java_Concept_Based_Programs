import java.util.*;


class INPUT2
{
    public static void main(String h[])
    {
        Scanner sobj = new Scanner(System.in);
        char iNo1 = '\0';
        char iNo2 = '\0';
        char iAns = '\0';

        System.out.println("enter character:");
        iNo1 = sobj.nextLine();
        System.out.println("enter character:");
        iNo2 = sobj.nextLine();
        iAns = iNo1 + iNo2;
        System.out.println("Addition is : " + iAns);


        
    }

}

//will give error because its not datatype string line no: 9,10,11