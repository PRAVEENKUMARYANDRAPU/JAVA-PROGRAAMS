import java.util.*;
class StrongNum
  {
    public static void main(String args[])
    {
      int num,digit=0,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      int temp=num;
      while(num>0)
        {
          digit=num%10;
          int fact=1;
           for(int i=1;i<=digit;i++)
            {
              fact=fact*i;                    
            }  
            sum=sum+fact;
              num=num/10;   
        }
        if (temp==sum)
      {
        System.out.println("the given value is strong number");
      }
      else
       System.out.println("the given value is not strong number");
    }
  }

      
          
     