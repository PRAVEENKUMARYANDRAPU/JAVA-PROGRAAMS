class Employee
  {
    String ename;
    int eid;
    String company;
    Employee(String ename,int eid,String company)
    {
      this.ename=ename;
      this.eid=eid;
      this.company=company;
    }
    public void display()
    {
      System.out.println(ename+" "+eid+" "+company);
    }
    public static void main(String args[])
    {
      Employee e1=new Employee("raj kumar",101,"adf");
      Employee e2=new Employee("anitha",102,"adfsd");
      e1.display();
      e2.display();
    }
  }
/*//to refer current class methods
class A
  {
    void x()
    {
      System.out.println("hello x");
    }
    void y()
    {
      System.out.println("hello y");
     this.x();
    }
  }
class ThisEx1
  {
    public static void main(String args[])
    {
    A obj=new A();
    obj.y();
    }
  }*/
/*//to refer current class Constructor
class Student
  {
    String name;
    int rollno;
    String course;
    float fee;
    Student(String name,int rollno,String course)
    {
    this.name=name;
    this.rollno=rollno;
    this.course=course;
    }
    Student(String name,int rollno,String course,float fee)
    {
      this(name,rollno,course);  //reusing the constructor
      this.fee=fee;
    }
    public void display()
    {
      System.out.println("name="+name+" "+"rollno="+rollno+" "+"course="+course+" "+"fee="+fee);
    }
  }
    class ThisEx3
      {
        public static void main(String args[])
        {
          Student s1=new Student("Prasanna",101,"cse");
          Student s2=new Student("Anitha",102,"ECE",12000f);
          s1.display();
          s2.display();
        }
      }*/