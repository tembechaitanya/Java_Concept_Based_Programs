

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("\nHello from run method!");
    }   
}

class ThreadDemo1
{
    public static void main(String A[])
    {
        MyThread th = new MyThread();
        th.start();
    }
}