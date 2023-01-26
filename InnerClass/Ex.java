/*class TestClass
{
    int data=20;
    class Inner
    {
        void display()
        {
            System.out.println("the value of data is"+data);
        }
    }
    public static void main(String args[])
    {
        TestClass obj=new TestClass();
        //OuterClassReference.new MemberInnerClassConstructor();  
        TestClass.Inner in=obj.new Inner();
        in.display();
    }
}*/
/*class Ex
  {
    String s="praveen";
    class innerex
      {
        void run()
        {
          System.out.println("the value of s is :"+s);
        }
      }
    public static void main(String args[])
    {
      Ex obj=new Ex();
      Ex.innerex in=obj.new innerex();
      in.run();
    }
  }*/


/*class Ex
  {
    String s="praveen";
    int age=16;
    class exx
      {
        public void run()
        {
          System.out.println("the value of s is :"+s);
          System.out.println("the value of age is :"+age);
        }
      }
    public static void main(String args[])
    {
      Ex obj=new Ex();
      Ex.exx in=obj.new exx();
      in.run();
    }
  }*/

class Empty
{
    String name="Anitha";
    int age=21;
    String add="LB Nagar";
    String name1="Rohit";
   int age1 =21;
  String add1="Hi-tech City";
    class student
    {
     void display()
      {
         System.out.println("the student details are "+name+" Age "+age+" Address "+add);
        System.out.println("the student details are "+name1+" Age "+age1+" Address "+add1);
        }
    }
    public static void main(String args[])
    {
        Empty obj=new Empty();
        Empty.student in=obj.new student();
        in.display();
    }
}