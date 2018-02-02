//********************************************************************
//  MagicSquare.java       Author: Arjun Kumar
//
//  2/1/2018
//********************************************************************

import java.text.NumberFormat;

public class MagicSquare
{
    private MagicSquare mag;
    private int MagicNum;
    
    public MagicSquare()
    {
        
    }
    private int getMagicNum ( )
    {
      int total = 0;
      //for (int i = 0; i < ; i++)
      {
          
        }
      
      
      
      return total;
      
    }
    
    public int addRow(MagicSquare mag, int row)
    {   int total = 0;
        for (int i = 0; i <= row.length(); i++)
        {
            total += mag[i];
        }

        return total;

    }
    public int addColumns(MagicSquare mag)
    {
        int total = 0;
        for (int i = 0; i < mag.length; i++)
        {
            total += 0;
        }
        
        
        
    }
    public int sumOneCol2DArray(int row)
    {   int total = 0;




        return total;

    }
   
}
