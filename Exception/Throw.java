import java.util.*;
class ThrowEx
  {
    public static void validate(int age)
    {
      if(age<18)
      {
        throw new ArithmeticException("not elligible to vote");
      }
      else
        System.out.println("you are elligilbe to vote");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int a=sc.nextInt();
      validate(a);
      
    }
  }