//********************************************************************
//  MagicSquare.java       Author: Arjun Kumar
//
//  2/1/2018
//********************************************************************

import java.text.NumberFormat;

public class MagicSquare
{
    private int MagicNum;
    public int[][] magic;
    public MagicSquare(int[][] array)
    {
        magic = array;
       // MagicNum = add up nmbers in the row
    }
    
    /**
     * adds up the first row in the array to get the magic number of the array that the rest of the rows/columns should folllow
     * @return int, which is the magic num
     */
    private int getMagicNum ( )
    {
      int magNum = 0;
      
      //adds up first row
      magNum = addRow(0);
      
      return magNum;
      
    }
    
    /**
     * adds up each row/column to check if equal to magic number
     * @return boolean, if rows and columns = magic number
     */
    public boolean isMagic ()
    {
        boolean ToF = false;
        boolean ToF_row = false;
        boolean ToF_col = false;
        
        int magicNum = getMagicNum();
        int numRows = 0;
        int numCols = 0;
        //checks each row
        for (int r = 0; r <= magic.length; r++)
        {
            if (magic.addRow(r) == magicNum)
                numRows++;
        }
        if (numRows == magic.length)
            ToF_row = true;
        
        //checks each column
        for (int c = 0; c <= magic.length; c++)
        {
            if (magic.addColumn(c) == magicNum)
                numCols++;
        }
        if (numCols == magic.length)
            ToF_col = true;
        
        //if both each row and each col all add up to magic num
        if (ToF_col == true && ToF_row == true)
            ToF = true;
        
        return ToF;
    }
    
    /**
     * adds up the numbers in each row
     * @return an int, total of the row
     */
    public int addRow(int row)
    {   int total = 0;
        for (int c = 0; c <= magic[row].length; c++)
        {
            total += magic[row][c];
        }

        return total;

    }
    
    /**
     * adds up the numbers in each column
     * @return int, total of the column
     */
    public int addColumn(int col)
    {
        int total = 0;
        for (int r = 0; r < magic.length; r++)
        {
            total += magic[r][col];
        }
        
        return total;
        
    }
   
}
