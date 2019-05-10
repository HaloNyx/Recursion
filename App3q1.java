/**
 * The App3q1 class creates a program that stores a single string input until a period is entered, 
 * and then displays the entered strings in reverse order.
 * reverse () is the recursive method while getStrings () will store a single string input
 * from the keyboard until a period "." is entered.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.15
 * @author Juleen Chen
 */

import java.util.*;

public class App3q1
{
  /*
   * reverse is a recursive method that displays the strings in reverse order.
   */
  public void reverse (ArrayList <String> str)
  {
    if (str.size () == 0) return;
    System.out.println (str.remove (str.size () - 1));
    reverse (str);
  }
  
  /*
   * getStrings is a method that stores strings until a "." is entered.
   */
  public void getStrings ()
  {
    ArrayList <String> arr = new ArrayList <String> ();
    Scanner sc = new Scanner(System.in);
    while (true)
    {
      String s = sc.nextLine ();
      arr.add (s);
      
      if (arr.get (arr.size () - 1).equals ("."))
        break;
    }
    sc.close ();
    
    reverse (arr);
  }
  
  public static void main (String [] args)
  {
    App3q1 t = new App3q1 ();
    t.getStrings ();
  }
}