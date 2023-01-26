class person
  {
    String name,gender;
    int age;
  }
class Student extends person
  {
    int rollno;
    String collegename;
      public void display()
    {
    System.out.println(name+" "+age+" "+gender+" "+rollno+" "+collegename);
  }
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.name="praveen";
      obj.age=88;
      obj.gender="male";
      obj.rollno=420;
      obj.collegename= "disco";
      obj.display();
      
    }
  
  }
/*class Animal
  {
    void eat()
    {
      System.out.println("eating");
    }
    void sleep()
    {
      System.out.println("sleeping");
    }
  }
class Dog extends Animal //dog is a child class
  {
    void bark()
    {
      System.out.println("barking");
    }
    public static void main(String args[])
    {
      Dog obj=new Dog();
      obj.eat();
      obj.sleep();
      obj.bark();
    }
    
  }*/