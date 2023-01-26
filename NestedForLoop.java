
/*when v need to type character//
class NestedForLoop
  {

    public static void main(String args[])
    {
      char ch='a';
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print((ch++)+" ");
            }
          System.out.println();
        }
    }
  }
/*number post increment 1,23,456,78910
class NestedForLoop
  {

    public static void main(String args[])
    {
      int k=1;
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print((k++)+" ");
            }
          System.out.println();
        }
    }
  }
/* number parten for i 22 333 we need to do i+
for 1,12,123 we need to do j+
class NestedForLoop
  {

    public static void main(String args[])
    {
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print(j+" ");
            }
          System.out.println();
        }
    }
  }




/*inverted right angle triangle//
import java.util.*;
class NestedForLoop
  { 
  public static void main(String args[])
    {
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=Sc.nextInt();
      for(int i=1;i<=5;i++)
      {
           for(int j=1;j<=i;j++)
            {
              System.out.print(" ");
            }
          for(int k=n;k>=i;k--)
          {
          System.out.print("*");
          }
          System.out.println();
        }
      }
  }

    




/*incrementand decrement comb of two//

//Left Angle Trinagle Pattern
import java.util.*;
class NestedForLoop
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=i;j<=n;j++)
            {
              System.out.print("-");
            }
          for(int k=1;k<=i;k++)
            {
              System.out.print("*");
            }
          System.out.println("");
        }
    }
  }





/*decrement
class NestedForLoop
  {

    public static void main(String args[])
    {
      for(int i=1;i<=5;i++)
        {
          for(int j=i;j<=5;j++)
            {
              System.out.print("*"+" ");
            }
          System.out.println();
        }
    }
  }*/
/*star right angle and triangle

class NestedForLoop
  {

    public static void main(String args[])
    {
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print("*"+" ");
            }
          System.out.println();
        }
    }
  }




/* SquarePattern
class NestedForLoop
  {
    public static void main(String args[])
    {
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=5;j++)
            {
              System.out.print("*"+" ");
            }
          System.out.println();
        }
    }
  }*/