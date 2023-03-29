
class Demo implements Runnable
{
    public void run()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt < 10; iCnt++)
        {
            System.out.println("Inside Run...");
        }
    }
    public void fun()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt < 10; iCnt++)
        {
            System.out.println("Inside fun...");
        }
    } 
}

class ThreadDemo
{
    public static void main(String args[])
    {
        System.out.println("Inside main thread...");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}