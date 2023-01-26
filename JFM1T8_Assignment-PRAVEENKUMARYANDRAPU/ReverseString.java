/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/
<<<<<<< HEAD

 import java.util.Scanner;
import java.lang.*;
public class ReverseString 
{
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Sentence to Reverse");
    String sentense=sc.nextLine();
    
      StringBuffer rev = new StringBuffer(sentense);
      rev.reverse();
      System.out.println("The Reverse of a given string is :-"+rev);
String word[]=sentense.split(" ");
String reversestring="";
    for(int i=0;i<word.length;i++)
      {
        String words=word[i];
        String revsword="";
        for(int j=words.length()-1;j>=0;j--)
          {
            revsword=revsword+words.charAt(j);
      }
        reversestring=reversestring+revsword+" ";
      }
       System.out.println("The reverse of a each word is "+reversestring);
      }
=======

import java.util.Scanner;

public class ReverseString {
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String s=sc.nextLine();
      String str="";
      for(int i=s.length()-1;i>=0;i--)
        {
          str=str+s.charAt(i);
        }
      System.out.println("the reverse word is:"+str);
    String[] word=s.split(" ");
    
     for(String w:word){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        s = s+sb.toString()+" ";  
       
    }  System.out.println("reversing each word at its place: "+s);
  }

>>>>>>> dc822a5d381bd2e72c5821f7ed37e5b0b1582d49
//main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result

}

//check the output. The actual output is not the expected output.
