/**
 * The App3q3 class creates a program to search an array of elements that are comparable. searchItem() id the recursive method.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.15
 * @author Juleen Chen
 */

import java.util.*;
import java.awt.*;

public class App3q3
{
    
    static Comparable [] array = {1, "hello", 1, 'a', 2, -999, 3.14, 0};
    
    /*
     * searchItem is a recursive method which searches an array of comparable objects and
     * returns true of the object is found, if not, then returns false. It accepts 2 parameters:
     * the index and the item it is looking for
     */
    public boolean searchItem (int i, Comparable item)
    {
        if (i >= array.length - 1)   //If the entire array has been searched
            return false;
        if (array [i].equals (item)) //If the two items are equal
            return true;
        i++;                         //increment to the next set
        return searchItem (i, item); //recursive call
    }
    
    
    /*
     * display () is a method that calls searchItem () with a local variable as the parameter for
     * searchItem ().
     */
    public void display ()
    {
        Comparable i = 1;
        System.out.println (searchItem (0, i));
    }
    
    
    public static void main (String[] args)
    {
        App3q3 s = new App3q3 ();
        s.display ();
    }
}
