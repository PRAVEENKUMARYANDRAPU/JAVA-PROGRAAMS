import java.util.*;
class StdMap
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      do
        {
          System.out.println("enter student rollno");
          int key=sc.nextInt();
          System.out.println("enter student name");
          String value=sc.next();
          hm.put(key,value);
          System.out.println("Enter another student (y/n)? ");
          ch=sc.next().charAt(0);
        }
        while(ch=='y');
      for(Map.Entry m:hm.entrySet())
        {
          System.out.println(m.getValue());
        }
        
    }
  }