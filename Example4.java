

class Example4
{
    public static void main(String A[])
    {
        int bal = 50000;
        int withdraw_bal = 6000;
 
        try
        {
            if(bal < withdraw_bal) 
            throw new ArithmeticException("\nWithdrawing amt is greter than actual balance");
            bal = bal - withdraw_bal;
            System.out.println("Transcation sucessfully completed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("\nException : " + e.getMessage());
        }
        
    }
}