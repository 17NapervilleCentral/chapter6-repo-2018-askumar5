import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.NumberFormat;
//Arjun Kumar

public class Purse
{
    //private ArrayList
      private ArrayList <Coin> wallet= new ArrayList<>();
      
      public Purse (){
          //wallet = new ArrayList<>();
          
          //a bunch of coins are added to the wallet - $1.15 in total
          wallet.add(new Coin('q', .25));
          wallet.add(new Coin('n', .05));
          wallet.add(new Coin('d', .10));
          wallet.add(new Coin('p', .01));
          wallet.add(new Coin('p', .01));
          wallet.add(new Coin('p', .01));
          wallet.add(new Coin('p', .01));
          wallet.add(new Coin('p', .01));
          wallet.add(new Coin('q', .25));
          wallet.add(new Coin('q', .25));
          wallet.add(new Coin('d', .10));
          wallet.add(new Coin('n', .05));
          wallet.add(new Coin('n', .05));
       
       }
      
      public Purse (Coin acoin)
       {  
        wallet.add(acoin);
       }
       
      /** precondition: Coin will be initialized (value and name) correctly
      *               each variable will have a value
          postcondition: Puts the Coin into the array list wallet
      * This method adds a new coin to the wallet, depending on the type of coin specified by the client/user.
      * The getName method is used to find out which type of coin the client inputted.
      * @param Coin object
      * @return none
      */
        public void add (Coin usercoin)
        {
            if (usercoin.getName().equals("Penny"))
                wallet.add(new Coin('p', .01));
            else if (usercoin.getName().equals("Nickel")) 
                wallet.add(new Coin('n', .05));
            else if (usercoin.getName().equals("Dime"))
                wallet.add(new Coin('d', .10));
            else //if the user's new coin is a quarter
                wallet.add(new Coin('q', .25));
            
        }
        /**
         * This allows a coin to be removed from the purse arraylist.
         * First, it checks for which type of coin the client wants to remove.
         * Then, it uses a while loop to go through the arraylist (another type of loop could've been used too, but this seemed the best way)
         * The counter on the while loop stops adding one to itself when the type of coin it is looking for is found.
         * The get method is used here to find the object at any given index (the variable count).
         * The getName method is used to find the name of each object to see if it matches the one we are looking for.
         * Finally, the remove method is used to remove the type of coin (at its first instance in the arraylist).
         */
        public void remove (Coin usercoin)
        {
            if (usercoin.getName().equals("Penny"))
            {
                int count = 0;
                while (!wallet.get(count).getName().equals("Penny"))
                    count++;           //count adds one each time until a penny is found in the arraylist
                wallet.remove(count);
            }
            else if (usercoin.getName().equals("Nickel"))
            {
                int count = 0;
                while (!wallet.get(count).getName().equals("Nickel"))
                    count++;           //count adds one each time until a nickel is found in the arraylist
                wallet.remove(count);
            }
            else if (usercoin.getName().equals("Dime"))
            {
                int count = 0;
                while (!wallet.get(count).getName().equals("Dime"))
                    count++;           //count adds one each time until a dime is found in the arraylist
                wallet.remove(count);
            }
            else //if the coin is a quarter
            {
                int count = 0;
                while (!wallet.get(count).getName().equals("Quarter"))
                    count++;            //count adds one each time until a quarter is found in the arraylist
                wallet.remove(count);
            }
            
        }
     /*
        public void add (String name)
        {
            String coinName = name;
            coinName = coinName.toLowerCase();
            
            if (coinName.equals("p"))
                wallet.add(new Coin('p', .01));
            else if (coinName.equals("n"))
                wallet.add(new Coin('n', .05));
            else if (coinName.equals("d"))
                wallet.add(new Coin('d', .10));
            else //the name is "Quarter"
                wallet.add(new Coin('q', .25));
        }
    
        //THE PREOBLEM HERE IS THAT REMOVE ISN'T WORKING SINCE IT DOESN'T HAVE THE INDEX TO REMOVE AT
        public void remove (String name)
        {
            String coinName = name;
            coinName = coinName.toLowerCase();
            
            if (coinName.equals("p"))
                wallet.remove(new Coin('p', .01));
            else if (coinName.equals("n"))
                wallet.remove(new Coin('n', .05));
            else if (coinName.equals("d"))
                wallet.remove(new Coin('d', .10));
            else //the name is "Quarter"
                wallet.remove(new Coin('q', .25));
        }
        */
       
        /**
         * This method uses a for loop to find out the number of pennies in the wallet.
         * @param none
         * @return int, the number of pennies in the wallet
         */
        public int getNumberOfPennies ()
        {
            int pennies = 0;
            
            for (int i = 0; i < wallet.size(); i++)
            {
                if (wallet.get(i).getName().equals("Penny"))
                    pennies++;
                }
                
            return pennies;
           }

    
           /**
         * This method uses a for loop to find out the number of nickels in the wallet.
         * @param none
         * @return int, the number of nickels in the wallet
         */
        public int getNumberOfNickels ()
        {
            int nickels = 0;
            
            for (int i = 0; i < wallet.size(); i++)
            {
                if (wallet.get(i).getName().equals("Nickel"))
                    nickels++;
                }
            
            return nickels;
           }

    
           /**
         * This method uses a for loop to find out the number of dimes in the wallet.
         * @param none
         * @return int, the number of dimes in the wallet
         */
        public int getNumberOfDimes ()
        {
            int dimes = 0;
            
            for (int i = 0; i < wallet.size(); i++)
            {
                if (wallet.get(i).getName().equals("Dime"))
                    dimes++;
                }
            
            return dimes;
           }

           /**
         * This method uses a for loop to find out the number of quarters in the wallet.
         * @param none
         * @return int, the number of quarters in the wallet
         */
        public int getNumberOfQuarters ()
        {
            int quarts = 0;
            
            for (int i = 0; i < wallet.size(); i++)
            {
                if (wallet.get(i).getName().equals("Quarter"))
                    quarts++;
                }
                
            return quarts;
           }

      /** Returns the total value of the coins in the array
      *                 list change
      *     @param none
            @return total, double which is the total amount of money in the purse
      */
        public double getTotal()
        {
            double total = 0;
            
            //adds up all the coins, but multiplies them by their respective values first in parenthesis
            total = (getNumberOfPennies() * .01) + (getNumberOfNickels() * .05) +
                (getNumberOfDimes() * .10) + (getNumberOfQuarters() * .25);
               
            return total;
        }
    
    
    
     /**
     *  Returns the all objects in the array list as Strings
     */
    
       public String toString()
       {
          String stringTotal = String.format("%, .2f", getTotal()); //rounds to two decimal places
          
          String output = "The total number of...\nPennies: " + getNumberOfPennies() +
                            "\nNickels: " + getNumberOfNickels() + "\nDimes: " + getNumberOfDimes() +
                            "\nQuarters: " + getNumberOfQuarters() + "\nAnd the total is: $" + stringTotal;
          return output;
       }

}
//end of purse