
class Employee
  {
    String empname;
    int id;
    String designation;
    int salary;
    public static void main(String args[])
        {
        Employee em1=new Employee();
          Employee em2=new Employee();
          Employee em3=new Employee();
        em1.empname="praveen";
          em1.id=123;
          em1.designation="dontknow";
          em1.salary=10;
          em2.empname="kumar";
          em2.id=124;
          em2.designation="unidentified";
          em2.salary=12;
          em3.empname="john";
          em3.id=420;
          em3.designation="fake";
          em3.salary=41;
        System.out.println(em1.empname+" "+em1.id+" "+em1.salary+" "+em1.designation);
        System.out.println(em2.empname+" "+em2.id+" "+em2.salary+" "+em2.designation);
        System.out.println(em3.empname+" "+em3.id+" "+em3.salary+" "+em3.designation);
        }
    }
  