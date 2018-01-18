//********************************************************************
//  Searches.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the linear and binary search algorithms.
//********************************************************************

public class Searches
{
   //-----------------------------------------------------------------
   //  Searches the array of integers for the specified element using
   //  a linear search. The index where the element was found is
   //  returned, or -1 if the element is not found.
   //-----------------------------------------------------------------
   //linear search will be on the test
   //one reason linear search is used is b/c list is not sorted/not ordered
   public static int linearSearch (int[] numbers, int key)
   {
      for (int index = 0; index < numbers.length; index++)
         if (key == numbers[index])
            return index;
      return -1;
   }

   //-----------------------------------------------------------------
   //  Searches the array of integers for the specified element using
   //  a binary search. The index where the element was found is
   //  returned, or -1 if the element is not found.
   //  NOTE: The array must be sorted!
   //-----------------------------------------------------------------
   //Test Question: what is the worse case scenario for how many times I have to search?
   public static int binarySearch (int[] numbers, int key)
   {
      int low = 0, high = numbers.length-1, middle = (low + high) / 2;

      while (numbers[middle] != key && low <= high)
      {
         if (key < numbers[middle])
            high = middle - 1;
         else
            low = middle + 1;
         middle = (low + high) / 2;
      }

      if (numbers[middle] == key)
         return middle;
      else
         return -1;
   }

   //-----------------------------------------------------------------
      //  Searches the array of integers for the specified element using
      //  a linear search. The index where the element was found is
      //  returned, or -1 if the element is not found.
      //-----------------------------------------------------------------
      public static int linearSearch (Comparable[] obj, Comparable key)
      {
         for (int index = 0; index < obj.length; index++)
            if (key.compareTo(obj[index]) == 0)
               return index;
         return -1;
   }


//-----------------------------------------------------------------
   //  Searches the array of Comparable Objects for the specified element using
   //  a binary search. The index where the element was found is
   //  returned, or -1 if the element is not found.
   //  NOTE: The array must be sorted!
   //-----------------------------------------------------------------
   public static int binarySearch (Comparable[] obj, Comparable key)
   {
      int low = 0, high = obj.length-1, middle = (low + high) / 2;

      while (obj[middle] != key && low <= high)
      {
         if (key.compareTo( obj[middle]) < 0)
            high = middle - 1;
         else
            low = middle + 1;
         middle = (low + high) / 2;
      }

      if (obj[middle] == key)
         return middle;
      else
         return -1;
   }


}//end of class







