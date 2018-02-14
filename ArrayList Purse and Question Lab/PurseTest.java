//Arjun Kumar
   
import java.util.*;
public class PurseTest
{
  public static void main(String[] args)
  {
    Purse new_purse = new Purse();
   
    Scanner keyboard = new Scanner(System.in);
    
    //display current total
    System.out.println(new_purse);
    
    
    //THE TWO EXAMPLES OF ADDINGS AND REMOVING COINS ARE BELOW
    
    
    //adding a nickel, and then a dime
    new_purse.add(new Coin('n', .05));
    new_purse.add(new Coin('d', .10));
    
    System.out.println("\nOne nickel and one dime have been added.\n");
    System.out.println(new_purse);
    
    
    //removing a quarter, and then a penny
    new_purse.remove(new Coin('q', .05));
    new_purse.remove(new Coin('p', .01));
    
    System.out.println("\nOne quarter and one penny have been removed.\n");
    System.out.println(new_purse);
    
    
    
    
    /* //this is all not necessary
    
    System.out.println("A - Add a Coin\nB - Remove a Coin\nC - Display Purse");
    String input = keyboard.next();
    input = input.toUpperCase();
    
    
    if (input.equals("A"))
    {
        System.out.println("Enter the type of coin you want to add (p/n/d/q): ");
        String name = keyboard.next();
        new_purse.add(name);
    }
    else if (input.equals("B"))
    {
        System.out.println("Enter the type of coin you want to remove (p/n/d/q): ");
        String name = keyboard.next();
        new_purse.remove(name);
    }
    else
        System.out.println(new_purse); //displays purse
   */
    
  }
}