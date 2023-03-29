
class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int a , int b)
    {
        iNo1 = a;
        iNo2 = b;
    }
}

class HashCode
{
    public static void main(String A[])
    {
        Demo obj = new Demo(11,21);

        System.out.println("Hash code for obj is : " + obj.hashCode());
    }
}