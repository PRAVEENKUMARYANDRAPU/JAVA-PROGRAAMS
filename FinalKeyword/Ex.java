//final method
class Animal
  {
    final void run()
    {
      System.out.println("running ");
    }
  }
class Dog extends Animal
  {
    void walk()
    {
      System.out.println("walking");
    
    }
    void run()
    {
      System.out.println("dog can run");
    }
  }
class FinalEx1
  {
    public static void main(String args[])
    {
    Animal ao=new Animal();
    ao.run();
    Dog dobj=new Dog();
    dobj.run();
    dobj.walk();
  }
  }
//final variable
class FinalEx
  {
    final int a=10;
    void display()
    {
     a=100;
      System.out.println(a);
    }
    public static void main(String args[])
    {
      FinalEx obj=new FinalEx();
      obj.display();
    }
  }
//final method
class Animal
  {
     final void run()
    {
      System.out.println("running ");
    }
  }
class Dog extends Animal
  {
    void walk()
    {
      System.out.println("walking");
    
    }
    void run()
    {
      System.out.println("dog can run");
    }
  }
class FinalEx1
  {
    public static void main(String args[])
    {
    Animal ao=new Animal();
    ao.run();
    Dog dobj=new Dog();
    dobj.run();
    dobj.walk();
  }
  }