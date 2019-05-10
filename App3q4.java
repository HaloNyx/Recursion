/**
 * The App3q4 class creates a program to search for the exit of a maze modelled by a 2d array.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.15
 * @author Juleen Chen
 */

import java.awt.*;
import java.util.*;

public class App3q4{
  
  // 2D maze
  int maze[][] ={
    {1,1,1,0,1},
    {0,0,1,0,1},
    {1,0,1,1,1},
    {1,0,0,0,0},
    {1,1,1,1,0}
  };
  
  // Empty Constructor
  public App3q4(){
  }
  
  public boolean findExit(int r,int c){
    // Set the current cell to a wall (alternative to using a visited array)
    maze[r][c] = 1;
    /* 
     For each adjacent cell check that the cell is within the boundaries and is a pass (0)
     If these are met, call findExit() on that adjacent cell
     */
    if(r+1 < 5 && maze[r+1][c] == 0)
      findExit(r+1,c);
    if(r-1 > 0 && maze[r-1][c] == 0)
      findExit(r-1,c);
    if(c+1 < 5 && maze[r][c+1] == 0)
      findExit(r,c+1);
    if(c-1 > 0 && maze[r][c-1] == 0)
      findExit(r,c-1);
    /*
     Recursion naturally stops once all open cells have 
     been changed into a wall.
     */
    // Return whether the end was replaced with a wall or not
    return (maze[4][4] == 1);
  }
  
  // Output
  public void Output(){
    
    // Check each entrance to see if it can get to the end
    for(int r=0;r<5;r++){
      if(findExit(r,0)) {
        System.out.println("True");
        return;
      }
    }
    for(int c=0;c<5;c++){
      if(maze[0][c] == 0){
        if(findExit(0,c)) {
          System.out.println("True");
          return;
        }
      }
    }
    System.out.println("False"); 
  }
  
  // Main method
  public static void main(String args[]){
    App3q4 m = new App3q4();
    
    m.Output();
  }
}