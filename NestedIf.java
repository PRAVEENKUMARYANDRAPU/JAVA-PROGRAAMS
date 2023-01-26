import java.util.*;
class NestedIf
  {
    public static void main(final String args[])
    {
      int a,b,c;
      final Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a,b,c");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if ((a>b)&&(a>c))
      {
        if(b>c)
        {
          System.out.println("the value of a is bigger");
        }
      else
        {
          System.out.println("the value of b is bigger");
        }
      }
        else
      {
        System.out.println(" the value of c is bigger");
      } 
    }
  }
//if given is alphabet or not    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))//