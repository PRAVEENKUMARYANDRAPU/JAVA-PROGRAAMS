//using while loop print one to n//
import java.util.*;
class WhileLoop
  {
    public static void main(String argd[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value:");
      n=sc.nextInt();
      while (i<=n)
        {
          if(i%2==0)
          {
            System.out.println(i+ " ");
            
          }
          i++;
        }
    }
  }
/* multiplication//
import java.util.*;
class WhileLoop
  {
    public static void main(String args[])
    {
      int i=1,x,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("which number table you want");
      x=sc.nextInt();
      System.out.println("enter the n value");
      n=sc.nextInt(); 
      while(i<=n)
        {
          int result=(x*i);
          System.out.println(x+"*"+i+"="+result);
        i++;
        }
    }
  }*/

/*odd and sum
import java.util.*;
class  WhileLoop
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2!=0)
          {
          System.out.println(i);
            sum=sum+i;
            
           }
      i++;     
      }
       System.out.println(" sum of odd num"+sum);
   }
  }*/
/* even and sum
import java.util.*;
class  WhileLoop
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0)
          {
          System.out.println(i);
            sum=sum+i;
            
           }
      i++;     
      }
       System.out.println(" sum of even num"+sum);
   }
  }*/
/*even number
import java.util.*;
class  WhileLoop
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0)
          {
          System.out.println(i);
            s
           }
      i++;
      }
   }
  }*/

/*50TO1
import java.util.*;
class  WhileLoop
  {
    public static void main(String args[])
    {
      int i=50;
      while(i>=1)
        {
          System.out.println(i+" ");
          i--;
        }
    }
  }*/
/*ONE TO 10
import java.util.*;
class  WhileLoop
  {
    public static void main(String args[])
    {
      int i=1;
      while(i<=10)
        {
          System.out.println(i);
          i++;
        }
    }
  }*/