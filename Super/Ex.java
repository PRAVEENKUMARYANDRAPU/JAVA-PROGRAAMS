/*//super is used to invoke immediate parent class constructor
class Person
  {
    int id;
    String name;
    Person(int id,String name)
    {
      this.id=id;
      this.name=name;
    }
  }
class Emp extends Person
  {
    float salary;
    Emp(int id,String name,float salary)
    {
      super(id,name);
      this.salary=salary;
    }
    void display()
    {
      System.out.println(id+" "+name+" "+salary);
    }
  }
class SuperEx3
  {
    public static void main(String args[])
    {
      Emp obj=new Emp(101,"ankit",45000f);
      obj.display();
    }
  }
/*super keyword
class Animal
  {
    Animal()
    {
      System.out.println("animal is created");
    }
  }
class Dog extends Animal{
  
  Dog()
  {
    super();
  System.out.println("dog is created");
}
}
class SuperEx2
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
    }
  }

/*super keyword is used to invoke immediate parent class method
class Animal
  {
    void sleep()
    {
      System.out.println("sleeping");
    }
    void eat()
    {
      System.out.println("all animals can eat");
    }
  }
class Dog extends Animal{
  void walk()
  {
    System.out.println("walking");
  }
  void eat()
  {
    System.out.println("eating");
  }
  void bark()
  {
    System.out.println("barking");
  }
  void work()
  {
    sleep();
    super.eat();
    bark();
  }
}
class SuperEx1
  {
    public static void main(String args[])
    {
    Dog d=new Dog();
    d.eat();
    d.walk();
    d.work();
    
  }
  }
/*super keyword refers to immediate parent class instance variable
class Animal
  {
    String name="animal";
    String color="white";
  }
class Dog extends Animal
{
  String dname="dog";
  String color="black";
  public void print()
  {
    System.out.println(color);
    System.out.println(name);
    System.out.println(dname);
    System.out.println(super.color);
  }
}
class SuperEx
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.print();
    }
  }*/