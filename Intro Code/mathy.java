import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
    private int [][] square;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
            System.out.println ("hi from default constructor");

    }

    public mathy(int [][] array)
    {
        square = array;

    }


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs



//}end of class



    /**
        takes the odd numbers out of an array
        @param int[] values int [] to be populated
        @return int[] odd values in the array
    */
    
   //num1 and odd are aliases of client code
    public  void getOdd (int[] num1, int odd [])
    {   int j = 0;


        for( int i = 0; i<num1.length;i++)
        {
            if (num1[i] % 2 != 0)
            {
                odd[j] = num1[i];
                j++;
            }

        }

    }//end of getOdd



    /**
        takes the even numbers out of an num array
        assigns values to evennum array
        @param int[] values, int[] evenvalues
        @none
    */


    public int [] getEven(int[] num)
    {
       
        int [] evens = new int[num.length];
        /**/
        
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 == 0)
            {
                evens[i] = num[i];
            }
        }
        /*
       int j = 0;
       for (int number: num)
       {
            if (number % 2 == 0)
            {
                evens[j] = number;
                j++;
            }
            //j++;
        }
*/

        return evens;
    }//end of getEven







    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */

/*
    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add


    public double add (double x,double y)
    {

        return x+y;
    }

    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int [][] scores)
    {

        int total = 0;

        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)
                total += scores[row][col];
                
            System.out.println();
        }


        return total;

    }



    public int sumOneRow2DArray(int row)
    {   int total = 0;
        



        return total;

    }
        public int sumOneCol2DArray(int row)
        {   int total = 0;




            return total;

    }

    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
   public static int[] doubleSize(int[] array)
   {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length -1; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

   }
   
   public static void swapFirstandLast(int[] array)
   {
       int first = 0;
       int last = array.length;
       array[0] = array[last-1];
       array[last-1] = array[0];
       
   }
   
   public static void shiftRight(int[] array)
   {
       //shifts all but last element
       for (int i = 0; i < array.length -1; i++)
       {
           array[i+1] = array[i];
           
       }
       int last = array.length;
       array[0] = array[last-1];
   }

   public static void EvenToZero(int[] array)
   {
       for (int i = 0; i <= array.length -1; i++)
       {
           if (array[i] % 2 == 0)
               array[i] = 0;
       }
       
   }

   public static void TwoNeighbors(int[] array)
   {
       for (int i = 1; i < array.length -1; i++)
       {
           int neighbor1 = array[i-1];
           int neighbor2 = array[i+1];
           if (neighbor1 > neighbor2)
               array[i] = neighbor1;
           else
               array[i] = neighbor2;
           
        }
   }
   
   public static void MiddleRemoval(int[] array)
   {
       int length = array.length;
       if ((length + 1) % 2 == 0)
       {
           for (int i = ((length+1)/2); i < (length +1); i++)
           {
               array[i+1] = array[i];
            }
       }
       else
       {
           //sets i to middle element's index
           for (int i = ((length+1)/2); i < (length +1); i++)
           {
               array[i + 1] = array[1];
            }
        }
    }
   /*
    public static void EvenToFront(int[] array)
    {
        for (int i = 0; i <= array.length -1; i++)
       {
           if (array[i] % 2 == 0)
               array[i] = 0;
       }
    }
    */
   
   /*
   public static void SecondLargest(int[] array)
   {
       int max = array[0];
       for (int i = 1; i < array.length - 1; i++)
       {
           if (array[i] > max)
                max = array[i];
           
           for (int i = 0; i < array.length - 1; i++)
           {
               closest = max - 100;
               
            }
       }
   }
   */
  
   public static boolean IsInOrder(int[] array)
   {
       for (int i = 0; i < array.length; i++)
       {
        }
       
        return true;
   }
   
   
   
   
   
   
   
   
   
}//end of class