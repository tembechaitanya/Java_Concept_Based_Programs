

class MyThread extends Thread
{
    public void run()
    {
        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println(iCnt + " " + currentThread().getName());
        }
    }   
}

class ThreadDemo3
{
    public static void main(String A[]) throws InterruptedException

    {
        MyThread th1 = new MyThread();      //thread-0

        th1.start();
        th1.join();

        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println(iCnt + " " + currentThread().getName());
        }
    }
}