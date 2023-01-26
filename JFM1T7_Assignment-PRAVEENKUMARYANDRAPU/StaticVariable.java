/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/
<<<<<<< HEAD
import java.util.*;
public class StaticVariable {
  public static void main(String[]args)
  {
    Student obj= new Student(1,"Shree");
    Student obj1= new Student(2,"Balaji");
    Student obj2= new Student(3,"Ajay");
    obj.display();
    obj1.display();
    obj2.display();
  }
}
  class Student
    {
    int a;
       String name;
      Student(int n,String n1)
      {
        a=n;
        name=n1;
  
      }
      public void display(){
        
            System.out.print("Roll no: "+a+"   Name: "+name+"\n");
        
        
      }
=======
import java.util.*;
public class StaticVariable {
  public static void main(String[]args)
  {
    Student obj= new Student(1,"Praveen");
    Student obj1= new Student(2,"yandrapu");
    Student obj2= new Student(3,"NTR");
    obj.display();
    obj1.display();
    obj2.display();
  }
}
  class Student
    {
    int a;
       String name;
      Student(int n,String n1)
      {
        a=n;
        name=n1;
  
      }
      public void display(){
        
            System.out.print("Roll no: "+a+"   Name: "+name+"\n");
        
        
      }
>>>>>>> 19fff12b1317c31daf016a1eda75fb4c19e725c6
}

//main method

//initializing Student class constructor by 3 times and passing 3 student names

//displaying student name and roll number
     


//declare Student class andd add declare name, rollno(static)

//add getters and setterss


//You have to take the roll no as static and increment the value
