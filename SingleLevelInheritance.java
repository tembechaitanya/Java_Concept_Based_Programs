
class Ram
{
    public String x;
    public String y;
    public String z;

    public Ram()
    {
        System.out.println("Inside default constructor..");
        this.x = "Seeta";
        this.y = "Laxman";
        this.z = "Hanuman";
    }
    public void Ram_Parameterised(int A)
    {
        System.out.println("Inside Ram first : " + x );
        System.out.println("Inside Ram second : " + y );
        System.out.println("Inside Ram third : " + z );
    }
}

class Bharat extends Ram
{
    public String p;
    public String q;

    public Bharat()
    {
        this.p = "Kausallya";
        this.q = "Sumitra";
    }
    public void Bharat_Parameterised()
    {
        System.out.println("Inside Bharat : " + p );
        System.out.println("Inside Bharat : " + q );
    }

}


class SingleLevelInheritance extends Bharat
{
    public static void main(String A[])
    {
        System.out.println("\nInside main...");

        Ram robj = new Ram();
        robj.Ram_Parameterised(1);
        robj.Bharat_Parameterised();

    }
}