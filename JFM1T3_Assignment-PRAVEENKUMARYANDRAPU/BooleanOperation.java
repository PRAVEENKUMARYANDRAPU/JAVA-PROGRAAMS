//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.*;
public class BooleanOperation 
{
  public static void main(String args[])
  {
    boolean b,y;
    Scanner sc=new Scanner(System.in);
   System.out.println("enter b (true or false) is:");
     b=sc.nextBoolean();
     y=!b;
     System.out.println("the of b is:"+y);
  }
}
//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 

