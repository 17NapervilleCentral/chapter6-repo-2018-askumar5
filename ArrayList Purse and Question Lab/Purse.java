import java.util.ArrayList;

public class Purse
{
	//private ArrayList
	  private ArrayList <Coin> wallet;//= new ArrayList<>();
	  
	  //wallet.add(new Coin('q'));
	  /*Coin c1 = new Coin('q');
	 // wallet.add(c1);
	  wallet.add(Coin c2 = new Coin('n'));
	  wallet.add(Coin c3 = new Coin('d'));
	  wallet.add(Coin c4 = new Coin('p'));
	  wallet.add(Coin c5 = new Coin('p'));
	  wallet.add(Coin c6 = new Coin('p'));
	  wallet.add(Coin c7 = new Coin('p'));
	  wallet.add(Coin c8 = new Coin('p'));
	  wallet.add(Coin c9 = new Coin('q'));
	  wallet.add(Coin c10 = new Coin('q'));
	  wallet.add(Coin c11 = new Coin('d'));
	  wallet.add(Coin c12 = new Coin('n'));
	  */
	  
	  public Purse (){
	      wallet = new ArrayList<>();
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
	   
	   
	   }
	  
	  
	  public Purse (Coin acoin)
       {  
		wallet.add(acoin);
       }
      /** precondition: Coin will be initialized (value and name) correctly
      *               each variable will have a value
       	  postcondition: Puts the Coin into the array list change
      */
    	public void add (Coin acoin)
    	{
    	    String coinName = acoin.getName();
    	    
    	    
    	}
    
      /** Returns the total value of the coins in the array
      *                 list change
      		@return ???
      */
    	public double getTotal()
    	{
    
    
    		return 0;
    
    	}
    
    
    
     /**
     *  Returns the all objects in the array list as Strings
     */
    
       public String toString()
       {
          return " --";
       }

}
//end of purse