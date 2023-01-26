import java.util.*;
class MobileNum
  {
    public static void main(String args[])
    {
      String mnum;
     Scanner scanner = new Scanner(System.in);
      System.out.println("enter the mobile number");
      mnum=scanner.nextLine();
      if(mnum.length()==10)
      {
             System.out.println("Your mobile number is correct;");
    }
    else{
      System.out.println("mobile not correct:");
    }
  }
} 