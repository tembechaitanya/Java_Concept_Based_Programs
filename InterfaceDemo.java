
interface Circle
{
    float PI = 3.14f;           //characteristic
    float Area(float Radius);   //method
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
}

class InterfaceDemo
{
    public static void main(String A[])
    {
            
        System.out.println("\nInside main..");

        Circle cobj = new Marvellous();
        float fRet = 0.0f;
        fRet = cobj.Area(12.22f);

        System.out.println("Area is : "+ fRet);


    }
}