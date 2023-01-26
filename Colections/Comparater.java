//sorting done by using comparator Interface 
import java.util.*;
class Student
  {
    int rollno;
  String name;
  int age;
  Student(int rollno,String name,int age)
    {
      this.rollno=rollno;
      this.name=name;
      this.age=age;
    }
  }
class AgeComparator implements Comparator<Student>
    {
    public int compare(Student st1,Student st2)
      {
        if(st1.age==st2.age)
          return 0;
        else if(st1.age>st2.age)
          return 1;
        else
          return -1;
      }
    }
  class NameComparator implements Comparator<Student>
    {
      public int compare(Student st1,Student st2)
      {
        return st1.name.compareTo(st2.name);
      }
    }
public class ComparatorEx
  {
    public static void main(String args[])
    {
      Student s1=new Student(101,"sowjanya",32);
      Student s2=new Student(102,"anitha",25);
      Student s3=new Student(103,"lalitha",21);
      ArrayList<Student> al=new ArrayList<Student>();
      al.add(s1);
      al.add(s2);
      al.add(s3);
      System.out.println("sort by student age");
      AgeComparator ac=new AgeComparator();
      Collections.sort(al,ac);
      for(Student st:al)
        {
          System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
     System.out.println("sort by student name");
      NameComparator nc=new NameComparator();
      Collections.sort(al,nc);
      for(Student st:al)
        {
          System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
  }