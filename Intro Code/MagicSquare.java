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
    /**
     * this is the constructor
     * @param array
     */
    public MagicSquare(int[][] array)
    {
        magic = array;
    }
    
    /**
     * adds up the first row in the array to get the magic number of the array that the rest of the rows/columns should folllow
     * @return int, which is the magic num
     * @param none
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
     * @param none
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
        for (int r = 0; r < magic.length; r++)
        {
            if (addRow(r) == magicNum)
                numRows++;
        }
        if (numRows == magic.length)
            ToF_row = true;
        
        //checks each column
        for (int c = 0; c < magic.length; c++)
        {
            if (addColumn(c) == magicNum)
                numCols++;
        }
        if (numCols == magic.length)
            ToF_col = true;
        
        //isDiagonal
        boolean ToF_diag = isDiagonal();
            
        //if both each row and each col all add up to magic num
        if (ToF_col == true && ToF_row == true && ToF_diag == true)
            ToF = true;
        
        return ToF;
    }
    
    /**
     * adds up the numbers in each row
     * @return an int, total of the row
     * @param int, the row number
     */
    public int addRow (int row)
    {   int total = 0;
        for (int c = 0; c < magic[row].length; c++)
        {
            total += magic[row][c];
        }

        return total;

    }
    
    /**
     * adds up the numbers in each column
     * @return int, total of the column
     * @param int, the column number
     */
    public int addColumn (int col)
    {
        int total = 0;
        for (int r = 0; r < magic.length; r++)
        {
            total += magic[r][col];
        }
        
        return total;
        
    }
    
    /**
     * this makes sure that the magic square's diagonals add up to the magic number
     * @return boolean, true or false whether diagonals add up to magic numba
     */
    public boolean isDiagonal ()
    {
        int total = 0;
        for (int c = 0, r = (magic.length - 1); c < magic.length; r--, c++)
        {
            total += magic[r][c];
        }
        
        int total2 = 0;
        for (int r = 0; r < magic.length; r++)
        {
            total2 += magic[r][r];
        }
        
        boolean ToF_diag = false;
        
        int magicNum = getMagicNum();
        
        if (total == total2 && total2 == magicNum)
            ToF_diag = true;
        
        return ToF_diag;
        
    }
   
    /**
     * prints out if it's a magic square, and the magic number (if it is a magic square)
     * @return string
     */
    public String toString ()
    {
        String output =  " ";
        
        if (isMagic() == true)
            output = "This is a magic square. It's magic number is " + getMagicNum();
        else
            output = "This ain't a magic square.";
        return output;
    }
}
