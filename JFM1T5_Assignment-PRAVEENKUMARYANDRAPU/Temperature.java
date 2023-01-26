/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


<<<<<<< HEAD
import java.util.Scanner;
class Temperature
  {
public static void main(String args[]){

//Declare the variables and initialize
    int n;double min;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of days");
      n=sc.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the temperature of Day : "+(i+1));
          arr[i]=sc.nextInt();
        }
      min=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
             min=arr[i];
          }
        }
      System.out.println("The lowest temperature of the week "+n+" is "+min+"  celsius ");
=======
import java.util.Scanner;
class Temperature
  {
public static void main(String args[])
{
  double min;
      Scanner sc=new Scanner(System.in);
      int a[]=new int[7];
        for(int i=0;i<a.length;i++)
        {
          System.out.println("Enter the temperature of Day : "+(i+1));
          a[i]=sc.nextInt();
        }
      min=a[0];
      for(int i=1;i<a.length;i++)
        {
          if(a[i]<min)
          {
             min=a[i];
          }
        }
  System.out.println("The lowest temperature of the week  is "+min);
>>>>>>> b1ec354259ec32f9ef0949fc4db6b68eb56ff8fb
  }
//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

}

//you need to print the week number also in the output
