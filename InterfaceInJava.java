/*  Insterface is considered as a blue print of a class 
    which contains 2 things : 
    1. public static final charateristics 
    2. public abstract methods
*/

Interface Circle
{
    float pi = 3.14f;
    float Area(float radius);
    float Circumference(float radius);
}

class Marvellous implements Circle
{
    public float Area(float radius)
    {
        return pi * radius * radius;
    }

    public float Circumference(float radius)
    {
        return 2 * pi * radius;
    }
}

class InterfaceInJava
{
    public static void main(String Args[])
    {
        System.out.println("Value of PI is : " + Circle.pi);

        Circle cobj = new Circle();
        float Ret = 0.0f;

        Ret = cobj.Area(5.5f);
        System.out.println("Area of Circle is : " + Ret);

        Ret = cobj.Circumference(10.10f);
        System.out.println("Circumference is : " + Ret);        
    }
}