
/*//User defined objects added to list
import java.util.*;
class Student
  {
    int rollno;
    String name;
    String address;
    Student(int rollno,String name,String address)
    {
     this.rollno=rollno;
      this.name=name;
      this.address=address;
    }
  }
   public class ListEx
     {
    public static void main(String args[])
       {
         Student s1=new Student(123,"suhan","vizag");
         Student s2=new Student(234,"sitha","hyd");
         Student s3=new Student(678,"ram","hyd");
         ArrayList<Student> al=new ArrayList<Student>();
         al.add(s1);
         al.add(s2);
         al.add(s3);
         for(Student ob:al)
           {
             System.out.println(ob.rollno+" "+ob.name+" "+ob.address);
           }
         
       }
  }
/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
    System.out.println(al);
  //  ArrayList<String> al1=al.subList(0,2);
      System.out.println(al.subList(0,2));
    }
  }
/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
    System.out.println(al);
   ArrayList<String> al1=new ArrayList<String>(al.size());
      al1.addAll(al);
      al1.add("banana");
      al1.add("grapes");
      al1.add("mango");
      System.out.println(al1);
      al1.removeAll(al);
      System.out.println(al1);
      al.clear();
      al1.clear();
      System.out.println(al);
      System.out.println(al1);
      
      
    }
  }
/*Copying elements from one list to another list
import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
    System.out.println(al);
   ArrayList<String> al1=new ArrayList<String>(al.size());
      al1.addAll(al);
      al1.add("banana");
      al1.add("grapes");
      al1.add("mango");
      System.out.println(al1);
      
    }
  }
/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
      System.out.println("befor sorting");
      System.out.println(al);
    //Iterating the element using iterator interface
      System.out.println("after sorting");
      Collections.sort(al);
      System.out.println(al);
      Collections.reverse(al);
      System.out.println(al);
    }
  }
/*//Write a Java program to search an element in a array list.
import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
      System.out.println(al);
    //Iterating the element using iterator interface
      Scanner sc=new Scanner(System.in);
      System.out.println("enter element to search");
      String str=sc.next();
     if(al.contains(str))
     {
       System.out.println("element is found");
     }
      else
       System.out.println("element not found");
      }
  }
/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
      System.out.println(al);
    //Iterating the element using iterator interface
      Iterator<String> itr=al.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      
      
      }
  }
/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
      System.out.println(al);
    //Iterating the element using for loop
      System.out.println("Iterating elements through for loop");
      for(int i=0;i<al.size();i++)
        {
          System.out.println(al.get(i));
        }
      //Using for each
      //for(datatype variablename:arrayname)
      System.out.println("Iterating elements through for each loop");
      for(String str:al)
        {
          System.out.println(str);
        }
      }
  }
//hetro genious data
import java.util.*;
class ArrrayList
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList al=new ArrayList();
      al.add("apple");
      al.add(12);
      al.add(34.6f);
      al.add('D');
      al.add(456.78);
      System.out.println(al);
      al.set(2,44);
    System.out.println(al);
    
      System.out.println(al.get(3));
    
      }
  }
/*add the elements through the keyboard
import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the list");
      int num=sc.nextInt();
     ArrayList<Integer> al=new ArrayList<Integer>(); 
      for(int i=0;i<num;i++)
        {
          System.out.println("add element at "+i+" : ");
          al.add(sc.nextInt());
        }
     System.out.println(al);
      }
  }
/*import java.util.*;
class ArrrayList
{
  public static void main(String args[])
    {
     List<Integer> al= new ArrayList<Integer>();
    al.add(56);
      al.add(78);
       al.add(8);
       al.add(7);
      System.out.println(al);
      al.add(1,99);
        System.out.println(al);
      al.remove(78);
      System.out.println(al);
      al.insert(1,55);
      System.out.println(al);
}
}*/