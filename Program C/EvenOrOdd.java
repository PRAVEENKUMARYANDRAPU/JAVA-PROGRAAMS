//WAP to check whether a number is even or odd.//
import java.util.*;
class EvenOrOdd
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a");
      a=sc.nextInt();
      if(a%2==0)
         {
        System.out.println("the a value is even");
         }
      else
      {
        System.out.println("the a value is odd");
      }
    }
  }