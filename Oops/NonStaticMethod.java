/*class NonStaticMethod
  class Student1
  {
    String sname;
    int rno;
    public void insertRecord(String name,int rollno)
    {
      sname=name;
      rno=rollno;
    }
    public void display()
    {
      System.out.println(sname+" "+rno);
    }
    public static void main(String args[])
    {
      Student1 st=new Student1();
      Student1 st1=new Student1();
      st.insertRecord("radha",101);
      st.display();
      st1.insertRecord("kumar",102);
      st1.display();
    }
  }*/
//non static method with instance method//
class NonStaticMethod
  {
    String empname;
    int empid;
    String company;
    public void insertRecord(String name,int id,String comp)
    {
      empname=name;
      empid=id;
      company=comp;
    }
    public void display()
    {
      System.out.println(empname+" "+empid+" "+company);
    }
    public static void main(String args[])
    {
      NonStaticMethod emp=new NonStaticMethod();
        NonStaticMethod emp1=new NonStaticMethod();
      emp.insertRecord("praveen",452,"chingu");
     emp.display();
      emp1.insertRecord("kumar",789,"honda");
     emp1.display();
    }
  }