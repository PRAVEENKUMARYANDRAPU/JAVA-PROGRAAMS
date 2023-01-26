/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
<<<<<<< HEAD
import java.util.Scanner;
public class StaticBlock {
  public static void main(String[] args){
    Student s = new Student();
    s.display(); 
  }
}
 class Student {
  static String college_name;
  String name[] = new String[3];
  int roll_num[] = new int[3];
  static {
    college_name = "IIT";
  }
  Student(){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<name.length&&i<roll_num.length;i++){
      System.out.print("Enter the student name: ");
      name[i] = sc.next();
      System.out.print("Enter the student Roll No: ");
      roll_num[i] = sc.nextInt();
    }
    sc.close();
  }
  public void display(){
    for(int i=0;i<name.length&&i<roll_num.length;i++){
      System.out.println();
      System.out.println("Student Name: "+name[i]+"\n"+"Student Roll No: "+roll_num[i]+"\n"+"College Name: "+college_name);
    }
  }
=======
public class StaticBlock 
{
  String name;
  int rollno;
  static String clgname="IIT";
  StaticBlock(String sname,int rno)
  {
   name=sname;
   rollno=rno;
  }
  void display()
  {
      System.out.println("Student name: "+name);
    System.out.println("Student Roll No:  "+rollno);
      System.out.println("College Name: "+clgname);
    System.out.println(" ");
    }
    public static void main(String args[])
    {
       StaticBlock st=new StaticBlock("Sri",1);
      StaticBlock st1=new StaticBlock("Balaji",2);
      StaticBlock st2=new StaticBlock("Ram",3);
      st.display();
      st1.display();
      st2.display();
  }
>>>>>>> 19fff12b1317c31daf016a1eda75fb4c19e725c6
}
//main method

//initialize Student class constructor for three times

//Create an array and add the 3 student to it

//take input from user 3 times using for loop 

//creating Student class and declaring variables

//creating staticBlock in that give collegename

//add getters and setters

//creating dispCollegename static method 
     

//Logic is good but you have to take the static block
