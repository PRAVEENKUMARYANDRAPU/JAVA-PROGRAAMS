/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum 
{
  public static void main(String args[])
  {
    int a[]=new int[10];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
    for(int i=0;i<a.length;i++)
      {
        sum=sum+a[i];
      }
    System.out.println("the sum of the numbers are: "+sum);
  }

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
