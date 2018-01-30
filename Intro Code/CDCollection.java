//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.ArrayList;
public class CDCollection
{
   private int count;
   private double totalCost;
   
   private ArrayList <CD> collection = new ArrayList<>();
   
   /**
   *  Creates an initially empty collection.
   */
   public CDCollection ()
   {
      
      count = 0;
      totalCost = 0.0;
   }

  
   /**
   *  Adds a CD to the collection, keeping list in order according to
      rating.
   *  @param
   */
   public void addCD (String title, String artist, double cost,
                      int tracks, int rating)
   {// must rewrite this method!!!!!!!!!
      CD cd1 = new CD (title, artist, cost, tracks, rating);
      collection.add(cd1);
      totalCost += cost;
      count++;
      
      for (int i = 0; i < collection.size(); i++)
      {
          if (collection.get(i).getRating() > collection.get(i + 1).getRating())
          {
              CD cdHold1 = collection.get(i);
              CD cdHold2 = collection.get(i+1);
              collection.set(i+1, cdHold1);
              collection.set(i, cdHold2);
              
            }
        }
   }

   /**
   *  Returns a report describing the CD collection.
   */
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";

      for (int cd = 0; cd < count; cd++)
         report += collection.toString() + "\n";

      return report;
   }
   public CD cheapest(int rate)
   {
       double low =collection.get(0).getPrice();
       int ind = 0;
       for (int i = 0; i<collection.size(); i++)
       {
           if (rate == collection.get(i).getRating())
           {
               if (collection.get(i).getPrice() < low)
               {
                   low = collection.get(i).getPrice();
                   ind = i;
                }
            }
        }
        return collection.get(ind);
   }

   /**
   *  Removes a CD.
   */
   public CD removeCD (String name)
   {
       for (int i = 0; i < collection.size(); i++)
       {
           if (collection.get(i).getName() == name)
           {
                CD cd1 = collection.get(i);
                collection.remove(i);
            }
           else
           {
                CD cd1;
              
            }
        }
    }
   //-----------------------------------------------------------------
   //  Doubles the size of the collection by creating a larger array
   //  and copying the existing collection into it.
   //-----------------------------------------------------------------
   /*
   private void increaseSize ()
   {
      CD[] temp = new CD[collection.length * 2];

      for (int cd = 0; cd < collection.length; cd++)
         temp[cd] = collection[cd];

      collection = temp;
   }
   */
  
}//end of class