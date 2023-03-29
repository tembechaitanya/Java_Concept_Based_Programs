
class MyThread implements Runnable
{
    public void run()
    {
        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}


class ThreadDemo5
{
    public static void main(String A[])
    {
        MyThread th =  new MyThread();
        Thread th1 = new Thread(th);
        
    }
}