import java.util.*;
class SimpleIfElse
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println(" enter the number");
      a=sc.nextInt();
      if((a%5==0)&&(a%11==0))
      {
         System.out.println("the given number is divisibe");
      }
      else
         System.out.println(" the give number is  not divisible");
    }
  }
//positive or negative if(a>0) is positive//
//even or odd if(a%2==0)//
//if the give num is divisible by 5 and  11 then if((a%5==0)&&(a%11==0))
  