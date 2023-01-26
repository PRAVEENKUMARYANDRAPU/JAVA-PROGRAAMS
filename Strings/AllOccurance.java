import java.util.*;
class CharString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a;
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
 System.out.println(a.charAt(i)+"    "+count);
              }
          }
    }*/
 
/*import java.util.*;
class AllOccurance
  {
    public static void main(String args[])
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string to search for all occurances");
      String s=sc.nextLine();
      System.out.println("enter the character to search");
      char ch=sc.next().charAt(0);
      for(int i=0;i<s.length();i++)
        {
          if(ch==s.charAt(i))
          {
            System.out.println("Given character "+ch+" is at position: "+i);
            count++;
          }
          }
      System.out.println("count of the character is :"+count);
    }
  }*/
import java.util.*;
  class AllOccurance
    {
    
public static void main(String args[])
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the sring to all occurance");
  String s=sc.newLine();
System.out.println("enter the character to search");
  char ch=sc.next().charAt(0);
  for(int i=0;i<s.length();i++)
    {
      if(ch==s.chatrAt(i));
      {}
    }
    
  
  }