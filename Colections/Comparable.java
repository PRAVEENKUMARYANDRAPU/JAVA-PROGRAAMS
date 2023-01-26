//comparable Interface
import java.util.*;
class Student implements Comparable<Student>
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
  public int compareTo(Student st)
  {
  if(age==st.age)
  return 0;
else if(age>st.age)
  return 1;
else
  return -1;
  }
}
public class ComparableEx
  {
    public static void main(String args[])
    {
      Student s1=new Student(101,"sowjanya",32);
      Student s2=new Student(102,"lalitha",25);
      Student s3=new Student(103,"anitha",21);
      ArrayList<Student> al=new ArrayList<Student>();
      al.add(s1);
      al.add(s2);
      al.add(s3);
      Collections.sort(al);
      for(Student st:al)
        {
          System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
      
    }
  }