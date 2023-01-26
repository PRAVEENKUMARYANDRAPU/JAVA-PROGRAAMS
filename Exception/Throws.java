import java.util.*;
class ThrowsEx
  {
    public void checkAge(int age) throws ArithmeticException
    {
      if(age<18)
      {
        throw new ArithmeticException("not elligible to vote");
      }
      else{
        System.out.println("ellgible to vote");
      }
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int a=sc.nextInt();
     ThrowsEx obj=new ThrowsEx();
      try{
      obj.checkAge(a);
      }
      catch(Exception e)
        {
          System.out.println("there is a exception");
          e.printStackTrace();
        }
      System.out.println("exception handled");
      
      }
  }