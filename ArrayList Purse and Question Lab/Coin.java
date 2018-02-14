/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/

import java.util.Random;

public class Coin
{
    /*
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private double amount;
   private char type;
   */
  
   private char name;
   private double value;

   /**-----------------------------------------------------------------
   *  Sets up the coin by flipping it initially.
   */
   public Coin (char name, double value)
   {
      //flip();
      this.name = name;
      this.value = value;
   }
/*
   /**-----------------------------------------------------------------
   *  Flips the coin by randomly choosing a face value.
   */
  /* 
  public void flip ()
   {
      face = (int) (Math.random() * 2);
   }
   /**-----------------------------------------------------------------
   *  Returns true if the current face of the coin is heads.
        @return boolean, true if heads
   *
   
   public boolean isHeads ()
   {
      return (face == HEADS);
   }rfr
  */
 /**
  * finds out what the name of the coin is
  */
   public String getName ()
   {
       String coinName;
       name = Character.toLowerCase(name); //makes it lower case always
       if (name == 'q')
            coinName = "Quarter";
       else if (name == 'd')
            coinName = "Dime";
       else if (name == 'n')
            coinName = "Nickel";
       else
            coinName = "Penny";
            
       return coinName;
    }
    public String toString()
    {
      String output = "Penny: $0.01\nNickel: $0.05\nDime: $0.10\nQuarter: $0.25";
      
      return output;
    }
    /*
   public double getValue ()
   {
       double value;
       name = Character.toLowerCase(name); //makes it lower case always
       if (name == 'q')
            value = .25;
       else if (name == 'd')
            value = .10;
       else if (name == 'n')
            value = .05;
       else
            value = .01;
       
       return value;
    }
    */
   /*
   /**-----------------------------------------------------------------
   *  Returns the current face of the coin as a string.
        @return String
   */
 /*
   public String toString()
   {
       
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
      
   }
   */
  
}