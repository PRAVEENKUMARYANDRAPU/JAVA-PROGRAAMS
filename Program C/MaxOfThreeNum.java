import java.util.*;
class MaxOfThreeNum
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enthe the value of a");
      a=sc.nextInt();
      System.out.println("enthe the value of b");
      b=sc.nextInt();
      System.out.println("enthe the value of c");
      c=sc.nextInt();
      
      if((a>b)&&(a>c))
      {
         if(b>c)
           
         {
        System.out.println("the value of a is maximum");
         }
      else
      {
        System.out.println("the value of b is maximum");
      }
      }
        else
         {
          System.out.println("the value of c is maximum");
         }  
    }
  }