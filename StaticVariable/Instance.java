//Displaying the student deatils in a college using static variable
class Student5
  {
    String name;
    int rollno;
    static String clgname="ssiet";
    Student5(String sname,int rno)
    {
      name=sname;
      rollno=rno;
    }
    void display()
    {
      System.out.println("the student detials are");
      System.out.println(name+" "+rollno+" "+clgname);
    }
    public static void main(String args[])
    {
      Student5 st=new Student5("praveen",123);
      Student5 st1=new Student5("lohith",122);
      Student5 st2=new Student5("venkatesh",124);
      st.display();
      st1.display();
      st2.display();
      
    }
  }

class Counter
  {
    static int count=0;
    Counter()
    {
      count++;
      System.out.println(count);
    }
    public static void main(String args[])
    {
      Counter c1=new Counter();
      Counter c2=new Counter();
      Counter c3=new Counter();
    }
  }


//Static Method
/*import java.util.*;
class Factorial
  {
    public static void fact(int num)
    {
      int fact=1;
      for(int i=1;i<=num;i++)
        {
          fact=fact*i;
        }
      System.out.println("the factoral of num is :"+fact);
    }
  }
    class StaticMethod
      {
     public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      Factorial.fact(n);
    }
         
  }*/