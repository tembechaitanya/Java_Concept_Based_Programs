

class MyThread extends Thread
{
    public void run()
    {
       for(int iCnt = 1; iCnt <= 10; iCnt++)
       {
        System.out.println(iCnt);
       } 
    }   
}

class ThreadDemo2
{
    public static void main(String A[])
    {
        MyThread th1 = new MyThread();      //thread-0
        MyThread th2 = new MyThread();      //thread-1


        th1.start();
        th2.start();        

    }
}