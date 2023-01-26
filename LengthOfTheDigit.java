//Length of the digits or length of a number
import java.util.*;
class LenDigit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int num=sc.nextInt();
      int length=0;
      while(num>0)
        {
          length++;
          num=num/10;
        }
      System.out.println("the length of the number is:"+length);
      
    }
  }