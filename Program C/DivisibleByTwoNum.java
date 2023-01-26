//. WAP to check whether a number is divisible by 5 and 11 or not.//
import java.util.*;
class DivisibleByTwoNum
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a");
      a=sc.nextInt();
      if ((a%5==0)&&(a%11==0))
      {
        System.out.println(" a is divisible by 5 and 11");
      }
      else
        System.out.println(" a is not  divisible by 5 and 11");
    }
  }
        