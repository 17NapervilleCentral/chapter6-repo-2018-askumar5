//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account implements Comparable
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

    private boolean locked_obj = false;
    private int password = 54321;

   private int acctNumber;
   private double balance;
   private String name;
   private int type; //1- savings, 2 - checking, 2 - other

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account (String owner, int account, double initial, int type)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      this.type = type;
   }

   //-----------------------------------------------------------------
   //  Validates the transaction, then deposits the specified amount
   //  into the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double deposit (double amount)
   {
      if(locked_obj)
      {
          System.out.println("access is denied--foo");
          return 0;
      }
          if (amount < 0)  // deposit value is negative
          {
             System.out.println ();
             System.out.println ("Error: Deposit amount is invalid.");
             System.out.println (acctNumber + "  " + fmt.format(amount));
          }
          else
             balance = balance + amount;
          return balance;


   }

   //-----------------------------------------------------------------
   //  Validates the transaction, then withdraws the specified amount
   //  from the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw (double amount, double fee)
   {
       if (locked_obj)
       {
           System.out.println("access denied foo");
           return 0;
       }
            amount += fee;

            if (amount < 0)  // withdraw value is negative
            {
             System.out.println ();
             System.out.println ("Error: Withdraw amount is invalid.");
             System.out.println ("Account: " + acctNumber);
             System.out.println ("Requested: " + fmt.format(amount));
            }
            else
             if (amount > balance)  // withdraw value exceeds balance
             {
                System.out.println ();
                System.out.println ("Error: Insufficient funds.");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                System.out.println ("Available: " + fmt.format(balance));
             }
             else
                balance = balance - amount;

            return balance;
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the account number.
   //-----------------------------------------------------------------
   public int getAccountNumber ()
   {
      return acctNumber;
   }

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return (acctNumber + "\t" + name + "\t\t" + fmt.format(balance));
   }

     //lockable methods----------------------------
      //  This is the section to implement interface lockable
      //-----------------------------------------------------------------
     public void setkey (int pass)
     {
        password = pass;
     }

     public void lock ( int locker)
     {
         if (locker == password)
            locked_obj = true;

     }
     public void unlock(int unlocker)
     {
        if (unlocker == password)
            locked_obj = false;
     }

    public boolean locked ()
    {
        return locked_obj;
    }

    //Comparable methods----------------------------
          //  This is the section   to implement interface Comparable
          // it compares the acctNumber
          //-----------------------------------------------------------------
    public int compareTo (Object other)
    {
            //autoboxing
            Account a = (Account) other;
            
            int result;
            
            /*
            if (acctNumber == a.acctNumber)
                result = acctNumber.compareTo(a.acctNumber);
              
                */


            return 0;
    }

    /**
     * This calculates the hash number. First, the number is set to one and then multiplied by each number of each character in the Account's name.
     * Note: Absolute value of the number is taken to avoid a negative hash number.
     * Next, the account number is added to the number.
     * Finally, one fifth of the balance is added to the number. This is the final hash_num
     */
    public int hash()
    {
        int hash_num = 1;
        for (int i = 0; i < name.length(); i++)
        {
            hash_num *= name.charAt(i);
        }
        hash_num = Math.abs(hash_num); //absolute value taken
        
        hash_num += acctNumber; //add the account number
        int num = (int) balance / 5;
        hash_num += num;
        /*
        for (int i = 0; i < (balance / 5); i++)
        {
            hash_num += i;
        }
*/
        acctNumber = hash_num % 100000000; //makes the account an 8-digit version of the hash_number
        
        return hash_num;
    }


}