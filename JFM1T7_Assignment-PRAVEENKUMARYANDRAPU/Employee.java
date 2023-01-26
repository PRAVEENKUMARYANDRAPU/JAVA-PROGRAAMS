/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/
<<<<<<< HEAD
import java.util.Scanner;
public class Employee {  
    String empname;
    int salary;
    int id;
public  void getInput(){
  Scanner ntr = new Scanner(System.in);
  System.out.println("enter the name of employee");
  empname=ntr.next();
  System.out.println("enter the salary");
  salary=ntr.nextInt();
  System.out.println("enter the id");
  id=ntr.nextInt();
}
public void display(){
  System.out.println("Employee id="+id+"\n "+"Employee name="+empname+"\n Employee salary="+salary+"\n");
}
  public static void main(String[]args)
  {
    //Employee obj=new Employee();
    Employee obj1[]=new Employee[2];
    for(int i=0;i<obj1.length;i++)
      {
        obj1[i]=new Employee();
        obj1[i].getInput();
        obj1[i].display();
      }
    
  }
=======

import java.util.Scanner;

public class Employee {  
  String empname;
    int salary;
    int id;
public  void getInput(){
  Scanner ntr = new Scanner(System.in);
  System.out.println("enter the name of employee");
  empname=ntr.next();
  System.out.println("enter the salary");
  salary=ntr.nextInt();
  System.out.println("enter the id");
  id=ntr.nextInt();

}
public void display(){
  System.out.println("Employee id="+id+"\n "+"Employee name="+empname+"\n Employee salary="+salary+"\n");


}
  public static void main(String[]args)
  {
    Employee obj=new Employee();
    obj.getInput();
    obj.display();
    obj.getInput();
    obj.display();
  }

>>>>>>> 19fff12b1317c31daf016a1eda75fb4c19e725c6
}

//Declare the variables

//Create a method getInput() 



//create Scanner object

//take input from user



//create display method


//Print Employee details



//Create a Employee constructor with the two employees

//check for loop to print two employee details
//Good
