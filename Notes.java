import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      int amount,result;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the the amount:");
      amount=sc.nextInt();
      if(amount>=1000)
      {
        result=amount/1000;
        System.out.println("the 1000 rupess notes are:"+result);
        amount=(amount-result*1000);
      }
      if(amount>=500)
      {
        result=amount/500;
        System.out.println("the 500 rupess notes are:"+result);
        amount=(amount-result*500);
      }
      if(amount>=200)
      {
        result=amount/200;
        System.out.println("the 200 rupess notes are:"+result);
        amount=(amount-result*200);
      }
      if(amount>=100)
      {
        result=amount/100;
        System.out.println("the 100 rupess notes are:"+result);
        amount=(amount-result*100);
      }
       if(amount>=10)
      {
        result=amount/10;
        System.out.println("the 10 rupess notes are:"+result);
        amount=(amount-result*10);
      }
       if(amount>=1)
      {
        result=amount/1;
        System.out.println("the 1 rupess notes are:"+result);
        amount=(amount-result*1);
      }
    }
  }