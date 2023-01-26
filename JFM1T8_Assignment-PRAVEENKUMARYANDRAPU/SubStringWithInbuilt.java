/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/
<<<<<<< HEAD
import java.util.Scanner;
public class SubStringWithInbuilt 
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the string :-");
  String str=sc.nextLine();
    System.out.println("enter the word to search :-");
    String word=sc.nextLine();
    if(str.contains(word))
    {
      System.out.println(word+" is found");
    }
    else
      System.out.println(word+" is not found");
=======


import java.util.Scanner;

public class SubStringWithInbuilt {
  public static void main(String[]args)
  {
    Scanner ntr =new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=ntr.nextLine();
    System.out.println("Enter search string : ");
    String s=ntr.nextLine();
    boolean result=s.contains(str);
    if(result)
    {
      System.out.println(s+" is found");
    }
    System.out.println(s+" is not found");
    
>>>>>>> dc822a5d381bd2e72c5821f7ed37e5b0b1582d49
  }
//main method
    


//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found

}

 //The output is not the expected output. check it
