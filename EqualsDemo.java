

class EqualsDemo
{
    public static void main(String A[])
    {
        String S1 = "Hello";
        String S2 = " Hello";

        System.out.println("HashCode of S1 : " + S1.hashCode());
        System.out.println("HashCode of S1 : " + S2.hashCode());

        if(S1.equals(S2))
        {
            System.out.println("Objets are equals !");
        }
        else
        {
            System.out.println("Objets are DIFFERENT !");
        }

        if(S1 == S2)
        {
            System.out.println("Objets are equals !");            
        }
        else
        {
            System.out.println("Objets are DIFFERENT !");
        }        
    }
}