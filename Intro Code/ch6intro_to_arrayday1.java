/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_arrayday1

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //ArrayList notes
/*
    // <> indicates the type of ArrayList
    ArrayList <String> farm = new ArrayList<>();

    farm.add("cow");farm.add("chicken");
    for (int i = 0; i<20;i++)
    {
        farm.add("cow");
        farm.add("chicken");
        farm.add("chicken");
        farm.add("duck");
        farm.add("horse");

    }
    farm.add("dog");farm.add("dog");farm.add("dog");
    farm.add("pig");farm.add("pig");farm.add("pig");
    farm.add("pig");farm.add("pig");farm.add("pig");

    System.out.println(farm);

    int count = 0;
    for (int i = 0; i<farm.size();i++)
    {
        if(farm.get(i).equals("chicken"))
            count++;

        if (farm.get(i).equals("chicken"))
            farm.remove(i);


    }

    System.out.println("There are " + count+ " chickens");

    System.out.println(farm);

    ArrayList <String> list = new ArrayList<>();

    //ArrayList <int> list1 = new ArrayList<>();// no primitive data types

    ArrayList <Integer> list1 = new ArrayList<>();

    ArrayList <CD> mycds = new ArrayList<>();

    //for(int i = 0; i<3; i++)
    //{

    mycds.add(new CD("Wilco","Jeff Tweety",12.99,16);
    mycds.add(new CD("Throwup","Britiny Spears",12.99,16);
    mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16);

    System.out.print(mycds);

    //}





/**/
        mathy useful = new mathy();
        int x = 50;
       int[] num = new int[20];
       int[] values = new int[MAX];
       //.length not a method public data
       int[] oddnum = new int[num.length];
       int[] evennum = new int[num.length];
       int[] negnum = new int[MAX];

       Random gen = new Random();
       //int[] num = new int[20];
// pop with random numbers range -50 to 50
/**/
       int location = 0;
       for(int i =0; i<num.length; i++)
       {
            num[i] = gen.nextInt(100)-50;
            if ()
        }
/*
       for(int i =0; i<num.length; i++)
       {
            System.out.println( num[i] );
        }
        System.out.println("-----------");
/*
        int look = 42;

        System.out.println(Searches.linearSearch(num,look)  );
        Sorts.selectionSort(num);
        System.out.println(Searches.binarySearch(num,look)  );



        //for each loop
/**/

        useful.getOdd(num,oddnum);

        for (int s : oddnum)
        {
            System.out.println(s);
        }
        System.out.print("---------------------------------evens");
/**/
        evennum = useful.getEven(num);
        for (int s : evennum)
        {
            System.out.println(s);
        }


        //System.out.println("----------SORTING-----------"  );




/*

        System.out.println(num.length  );
        num = doubleSize(num);





/*  mathy.getOdd(num);

        System.out.println("---------------");

        for (int s : oddnum)
            System.out.println(s);



/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*
//searching for 412
          for (int i = 0; i < MAX; i++)
          x++;

      // for (int i = 0; i < MAX; i++)
        //  values[num[i]+25] ++;
        //  x++;
        //how do you count the #of times each value comes up?

       for( int i =0; i<num.length; i++)
            System.out.print("\t" + num[i]);

       //for (int i = 0; i<50;i++)
       //   System.out.println("The number of times" + (i-25) +"is" +
       //                       "\t" + values[i]);




/*
        //foo(num[0]);
        //passing the address of the array
        foo(num);
        System.out.println(num);
        System.out.println("***"+num[0]);
/*
       System.out.println(oddnum[7]);

       odd(num,oddnum);

       negnum = neg(num);

 */


 /*
       //make a two dementional array
       int [][] table = new int [5][10];

       // Load the table with values
       for (int row=0; row < table.length; row++)
          for (int col=0; col < table[row].length; col++)
             table[row][col] = row * 10 + col;

       //print the table
        for (int row=0; row < table.length; row++)
        {
            for (int col=0; col < table[row].length; col++)
                System.out.print (table[row][col] + "\t");

            System.out.println();
        }


    // make a 2d array with an iniitalizer list.
    //print the length of row and col
/*
    int [][] scores = { {1,2,3},//6
                        {2,2,3},//7
                        {3,2,3},//8
                        {4,2,3}    };//9


    System.out.println(scores[0].length+"col");
    System.out.println(scores.length+"row");

    System.out.print("The sum of this array is" + mathy.sum2DArray(scores));

    System.out.print(mathy.sumOneRow2DArray(scores, 3));
    System.out.print(mathy.sumOneRow2DArray(scores[3]));


/*
    System.out.print(mathy.sumrow(scores[0]));



/**/
}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    /*


   public static void odd(int[] m_num, int[] m_odd)
   {

       int count =0;


   }// end of odd

 //====================================================
     public static int[] neg(int[] m_num)
      {


       return negarray;
   }//end of neg

    /*  */
}// end of class











