

class MyThread extends Thread
{
    public void run()
    {
       int c;
       c = 10 / 0;
    }   
}

class ThreadDemo3
{
    public static void main(String A[])
    {
        MyThread th1 = new MyThread();      //thread-0
        //MyThread th2 = new MyThread();      //thread-1


        //th1.start();
        th1.run();

        //th2.start();        

    }
}