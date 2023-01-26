//first and last num
//first and last digit
import java.util.*;

class Reverse
  {
  public static void main(String args[]) 
    {
    int num, first = 0, last = 0, digit = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number" );
    num = sc.nextInt();
    last = num % 10;
    while (num > 0) 
    {
      digit = num % 10;
      num = num / 10;
      System.out.println(num);
    }
   first=digit;
    System.out.println("first: " + first + "  "+"last digt:" + "  "+last);

  }
}
/*
// reverse a  num//
import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      int num,reverse=0,digit=0;
        Scanner sc=new Scanner(System.in); 
      System.out.println(" enter the number: ");
      num=sc.nextInt();
      while(num>0)
        {
          digit=num%10;
          reverse=reverse*10+digit;
          num=num/10;
        }
      System.out.println(" the reverse number is"+reverse);
      }
  }
*/