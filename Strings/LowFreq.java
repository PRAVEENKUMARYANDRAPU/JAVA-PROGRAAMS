
import java.util.*;
class LowFreq
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a;
     char ch='0';
      int min=1;
      System.out.println("enter the String is ");
      int count=1;
      a=sc.nextLine();
      int n=a.length();
     boolean s1[]=new boolean[n];
     
      for(int i=0;i<n;i++)
        {
          s1[i]=false;
        }
      System.out.println("the frequency of the character ");
      for(int i=0;i<n;i++)
          {
         if(s1[i]==true)
          continue;
          count=1;
          for(int j=i+1;j<n;j++)
         {
            if(a.charAt(i)==a.charAt(j))
               {
               count++;
               s1[j]=true;
                }
              }
 System.out.println(a.charAt(i)+" _____"+count);
            if(min!=count)
            {
              min=count;
              ch=a.charAt(i);
            }
              }
      System.out.println("the lowest frequency is "+ch);
      System.out.println("the minimum value is "+min);
          }
    }