import java.util.*;
class SimpleIf
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b)
      {
        System.out.println("a is bigger");
      }
      System.out.println("it is the simple if");
    }
  }