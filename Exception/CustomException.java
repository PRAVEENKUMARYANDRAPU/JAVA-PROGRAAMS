import java.util.*;
class InvalidAgeException extends Exception
  {
   public InvalidAgeException(String str)
    {
      super(str);
    }
  }
class CustomException1
  {
    public static void checkAge(int age) throws InvalidAgeException
    {
      if(age<18)
      {
        throw new InvalidAgeException("you are not ellible to vote");
      }
      else{
        System.out.println("you are elligible");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int a=sc.nextInt();
      try{
      checkAge(a);
      }
      catch(InvalidAgeException e)
        {
          System.out.println(e);
        }
      
    }
  }

/*import java.util.*;
class InvalidMobileNumberException extends Exception
  {
    InvalidMobileNumberException(String str)
    {
      super(str);
    }
  }
class CustomException2
  {
    public static void validate(String no) throws InvalidMobileNumberException
    {
      if(no.length()!=10)
      {
        throw new InvalidMobileNumberException("your mobile number is invalid");
      }
      else
      {
        System.out.println("it is valid");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter mobile number");
      long l=sc.nextLong();
      String num=String.valueOf(l);
      try{
      validate(num);
      }
      catch(InvalidMobileNumberException e)
        {
          System.out.println("exception handled in main");
          e.printStackTrace();
        }
      System.out.println("Exception handled");
    }
  }*/
import java.util.*;
class InvalidUserNameException extends Exception
  {
    public InvalidUserNameException(String us)
    {
      super(us);
    }
  }
class InvalidUser1
  {
    public static void checkName(String name) throws InvalidUserNameException
    {
      int count1=0,count2=0,count3=0;
     for(int i=0;i<name.length();i++)
       {
         if(name.charAt(i)>='A' && name.charAt(i)<='Z')
         {
           count1++;
         }
         if(name.charAt(i)>='0' && name.charAt(i)<='9')
         {
           count2++;
         }
          if(name.charAt(i)>='a' && name.charAt(i)<='z')
          {
            count3++;
          }
       }
      if(count1>0 && count2>0 && count3>0)
      {
        System.out.println("User name is valid "+name);
      }
      else
      {
        throw new InvalidUserNameException("User name is invalid");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the user name");
      String name=sc.next();
      try{
        checkName(name);
      }
      catch(InvalidUserNameException a)
        {
          System.out.println(a);
          a.printStackTrace();
        }
      System.out.println("Exception handled");
    }
  }