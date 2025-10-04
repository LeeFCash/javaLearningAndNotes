/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   public static final double OVERDRAFT_FEE = 29.95;
   private static int lastAssignedNumber = 1000;
   private double balance;
   private int accountNumber;
   
   

    public int getAccountNumber() {
        return accountNumber;
    }


   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      lastAssignedNumber++;
      accountNumber = lastAssignedNumber;
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   public String printBalance(){
       return "The balance is now $" + balance;
   }
   public String toString(){
       return "The balance is now $" + balance;
   }
}

