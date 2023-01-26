/*class ConstructorEx
  {
    
    ConstructorEx()
    {
   System.out.println("Constructor is executed");
    }
   
    public static void main(String args[])
    {
           ConstructorEx obj=new ConstructorEx(); 
    }
  }*/
//Parameterized constructor
/*class Student3
  {
    Student3(String sname,int rollno)
    {
      System.out.println("name="+sname+" "+"rollno="+" "+rollno);
    }
    public static void main(String args[])
    {
      Student3 st=new Student3("anay",101);
    }
  }*/
/*Parameterized constructor
import java.util.*;
class Student3
  {
    Student3(String sname,int rollno)
    {
      System.out.println("name="+sname+" "+"rollno="+" "+rollno);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      String name=sc.next();
      System.out.println("enter roll no");
      int rno=sc.nextInt();
      Student3 st=new Student3(name,rno);
    }
  }*/

/*non Parameterized constructor
import java.util.*;
class Student3
  {
    Student3()
    {
      String sname;
      int rollno;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      sname=sc.next();
      System.out.println("enter roll no");
      rollno=sc.nextInt();
      System.out.println("name="+sname+" "+"rollno="+" "+rollno);
    }
    public static void main(String args[])
    {
        Student3 st=new Student3();
    }
  }*/
//Parameterized constructor
/*import java.util.*;
class Student3
  {
    String name;
    int rno;
    Student3(String sname,int rollno)
    {
      name=sname;
      rno=rollno;
    }
    public void display()
    {
      System.out.println("name="+name+" "+"rollno="+" "+rno);
    }
    public static void main(String args[])
    {
     
      Student3 st=new Student3("sowjanya",524);
      st.display();
    }
  }*/

class Constructor
  {
    Constructor(String empName,int id,String designation)
    {
      System.out.println("name="+empName+" "+"id="+id+"role"+designation);
    }
    public static void main(String args[])
    {
      Constructor obj=new Constructor("Ram",  303,  " developer");
    }
  }

/*class Constructor
  {
    Constructor(String empname,int id)
    {
      System.out.println("name="+empname+" "+"id="+id);
    }
    public static void main(String args[])
    {
      Constructor obj=new Constructor("PRAVEEN",85);
    } 
  }*/