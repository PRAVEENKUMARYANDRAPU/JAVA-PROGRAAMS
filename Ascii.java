import java.util.*;
class Ascii
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      ch=sc.next().charAt(0);
      System.out.println("the value is:"+(int)ch);
      int value=ch;
      System.out.println(value);
    } 
  }