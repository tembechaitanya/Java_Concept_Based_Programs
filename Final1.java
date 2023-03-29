  class Demo
  {
    public int No1;
    public final int No2 = 11;
    public final int No3 ;

    public Demo()
    {
        this.No1 = 10;
        this.No3 = 21;
        System.out.println("Value of variable No1 is  : " + No1);
        System.out.println("Value of final No2 is  : " + No2++);    //error due to ++
        System.out.println("Value of final No3 is  : " + No3);
    }
  }

  class Final1 extends Demo
  {
    public static void main(String A[])
    {
        final int i = 51;

        System.out.println("inside main...");

        Demo obj = new Demo();

        System.out.println("Value of variable i is : " + i);

        System.out.println("Value of final No3 is  : " + obj.No3++); //error due to ++

        

    }
  }