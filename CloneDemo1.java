
class Employee implements Clonnable
{
    public int Eid;
    public String Name;
    public int Salary;

    public int Employee(int No, String Str, int Value)
    {
        this. Eid = No;
        this. Name = Str;
        this. Salary = Value;
    }
}

class CloneDemo1
{
    public static void main(String A[])
    {
        Employee eobj = new Employee(101, "Rahul", 100000);

        System.out.println("Employee Id " + eobj.Eid);
        System.out.println("Employee Name " + eobj.Name);
        System.out.println("Employee Salary " + eobj.Salary);        
    }
}