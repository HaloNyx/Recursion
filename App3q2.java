/**
 * The App3q2 class creates a program to reverse the digits of a integer without string methods. It utilises Math.log10 
 * to find the number of digits in a number. revDigits() is the recursive method.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.15
 * @author Juleen Chen
 */

import java.awt.*;
import java.util.*;

public class App3q2{
  
  // Empty constructor
  public App3q2(){}
  
  // Simple recursive method to reverse digits
  public int revDigits(int n)
  {
    if (n/10 == 0) 
      return n;
    return (n%10)*(int)(Math.pow(10,(int)(Math.log10(Math.abs(n))))) + revDigits(n/10);
  }
  
  // Handles input and output
  public void IO(){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input: ");
    int num = in.nextInt();
    System.out.println("Reversed: " + revDigits(num));
  }
  
  // Main method
  public static void main(String args[]){
    App3q2 b = new App3q2();
    
    b.IO();
  }
}