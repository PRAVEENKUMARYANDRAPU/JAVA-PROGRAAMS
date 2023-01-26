import java.util.*;
class PrimeNum
{
  public static void main(String args[])
  {
    int i,num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
        if(num%i==0)
        {
          count++;
        }
      }
        if(count==2)
        {
          System.out.println("given number is prime");
        }
        else
        {
          System.out.println("not prime");
        }
      
  }
}