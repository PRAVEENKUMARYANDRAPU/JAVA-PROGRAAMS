//WAP to input basic salary of an employee and calculate its Gross     salary according to following:
   // Basic Salary <= 10000 : HRA = 20%, DA = 80%
    //Basic Salary <= 20000 : HRA = 25%, DA = 90%
    //Basic Salary > 20000 : HRA = 30%, DA = 95%
//gs=bs+hra+da
import java.util.*;
class BasicSalary
{
  public static void main(String args[])
  {
    int salary,hra,da,Gross;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the basic salary is : ");
    salary=sc.nextInt();
    if (salary<=10000)
    {
      hra=(salary*20)/100;
       da=(salary*80)/100;
      Gross=(salary+hra+da);
      System.out.println("the gross salary is"+Gross);
    }
    else if(salary<=20000)
    {
      hra=(salary*25)/100;
       da=(salary*90)/100;
      Gross=(salary+hra+da);
      System.out.println("the gross salary is"+Gross);
    }
    else  if (salary>20000)
    {
      hra=(salary*30)/100;
       da=(salary*95)/100;
      Gross=(salary+hra+da);
      System.out.println("the gross salary is"+Gross);
    }
    else
    {
      System.out.println("not eligible");
    }
    
  }
}