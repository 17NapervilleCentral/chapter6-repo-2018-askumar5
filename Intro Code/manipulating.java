/**
 * Write a description of class manipulating here.
 * 
 * @author (your name) 
 * @version 1/18/18
 */
public class manipulating
{
    public static void main(String[] args){
    int [] ten = new int[10];
     
    //17 is first number
    ten[0] = 17;
    //29 is last number
    ten[9] = 29;
    for (int j = 1; j < ten.length; j++)
    {
        ten[j] = -1;
    }
    for (num: ten)
    {
        System.out.println(num);
    }
    for (int i: ten)
    {
        if (i != 9)
            System.out.print(ten[i] + ",");
        else
            System.out.print(ten[i]);
        }
    }
}
