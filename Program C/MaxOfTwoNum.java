import java.util.*;
class MaxOfTwoNum
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enthe the value of a");
      a=sc.nextInt();
      System.out.println("enthe the value of b");
      b=sc.nextInt();
      if(a>b)
        System.out.println("the value of a is maximum");
      else
        System.out.println("the value of b is maximum");
      
    }
  }