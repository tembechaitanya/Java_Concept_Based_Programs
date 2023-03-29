
class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String Str, int Value)
    {
        Eid = No;
        Name = Str;
        Salary = Value;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String Args[])
    {
        try
        {
            Employee eobj1 = new Employee(101, "Rahul", 100000);

            Employee eobj2 = new Employee(201, "Chaitu", 80000);

            System.out.println("Name of 1st Employee : " + eobj1.Name);
            System.out.println("Eid of 1st Employee : " + eobj1.Eid);
            System.out.println("Salary of 1st Employee : " + eobj1.Salary);

        }
        catch(CloneNotSupportedException obj)
        {
            
        }
    }
}