//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************


//SAAGAR AND ARJUN

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
   public void addCD (CD cd1)
   {// must rewrite this method!!!!!!!!!
      collection.add(cd1);
      totalCost += cd1.getPrice();
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
       CD cd1;// = new CD("Sorry, there's no CD by this name", " ", 1,1,1);
       for (int i = 0; i < collection.size(); i++)
       {
           if (collection.get(i).getName().equals(name))
           {
                //cd1 = collection.get(i);
                cd1= collection.remove(i);
                return cd1;
            }
            /*
           else
           {
                cd1 = new CD("Sorry, there's no CD by this name", " ", 1,1,1);
            }
            /**/
        }
       return new CD ("Sorry, there's no CD by this name", " ", 1,1,1); //null
    }
   public ArrayList<CD> choices(double low, double high, double rating)
   {
       ArrayList <CD> CDinstances = new ArrayList<>();
       
       for (int i=0; i<collection.size();i++)
       {
           if (collection.get(i).getPrice() >= low && collection.get(i).getPrice()<=high)
           {
               if (collection.get(i).getRating() == rating)
               {
                   CDinstances.add(collection.get(i));
                }
            }
       }
    
    return CDinstances;
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