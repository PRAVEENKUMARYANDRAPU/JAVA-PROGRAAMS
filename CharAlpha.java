//WAP to check whether a character is alphabet or not.//
import java.util.*;
class CharAlpha
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a");
      ch=sc.next().charAt(0); 
      if(ch>='A' && ch<='Z') || (ch>='a' && ch>='z')
        {
        System.out.println("the given value is alphabet");
        }
      else 
      {
      System.out.println("the given value is not alphabet");
      }
    }
  } 