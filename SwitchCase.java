// atm withdraw
import java.util.*;
class SwitchCase
  {
    public static void main(String args[])
    {
      int a,b,option,c;
      a=2000;
      Scanner sc=new Scanner(System.in);
      System.out.println("1.withdraw");
      System.out.println("2.deposit");
      System.out.println("3.balance");
      System.out.println("enter the option");
      option=sc.nextInt();
      
      System.out.println("enter the value: ");
      
       b=sc.nextInt();
      
     
      switch(option)
      {
        case 1:
           c=a-b;
        System.out.println("withdraw amount: " +c);
        break;
        case 2:
           c=a+b;
    System.out.println("the deposite amount is : " +c);
        break;
        case 3:
           c=a;
         System.out.println("the balance is : " +c);
        break;
      
        default:
          System.out.println("good bye");
      }
      
    }
    
  }


/*calculator
import java.util.*;
class SwitchCase
  {
    public static void main(String args[])
    {
      int a,b,option,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("1.addition");
      System.out.println("2.subtraction");
      System.out.println("3.multiplication");
      System.out.println("4.division");
      System.out.println("enter the option");
      option=sc.nextInt();
      System.out.println("enter the a value: ");
      a=sc.nextInt();
       System.out.println("enter the b value: ");
      b=sc.nextInt();
      switch(option)
      {
        case 1:
           c=a+b;
        System.out.println("the value of two numbers by addition is : " +c);
        break;
        case 2:
           c=a-b;
    System.out.println("the value of two numbers by subtraction is : " +c);
        break;
        case 3:
           c=a*b;
         System.out.println("the value of two numbers by multiply is : " +c);
        break;
        case 4:
           c=a/b;
        System.out.println("the value of two numbers by division is : " +c);
        break;
        
        default:
          System.out.println("it is not calcualtor");
      }
      
    }
    
  }
/*import java.util.*;
class SwitchCase
  {
    public static void main(String args[])
    {
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      number=sc.nextInt();
      switch(number)
      {
        case 1:
        System.out.println("the name of the weak is monday");
        break;
        case 2:
        System.out.println("the name of the weak is tuesday");
        break;
        case 3:
        System.out.println("the name of the weak is wednesday");
        break;
        case 4:
        System.out.println("the name of the weak is thusday");
        break;
        case 5:
        System.out.println("the name of the weak is friday");
        break;
        case 6:
        System.out.println("the name of the weak is saturday");
        break;
        case 7:
        System.out.println("the name of the weak is sunday");
        break;
        default:
          System.out.println("it is not a weak");
      }*/