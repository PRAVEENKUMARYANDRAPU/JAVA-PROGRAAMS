//Finally 
class ExceptionEx
  {
    public static void main(String args[])
    {
      
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(NullPointerException e)
          {
            System.out.println("this is catch block");
              e.printStackTrace();
          }
    
      finally{
        System.out.println("this is finally block");
      }
      System.out.println("exception handled");
    }
  }

/*//Finally 
class ExceptionEx
  {
    public static void main(String args[])
    {
      
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(ArithmeticException e)
          {
            System.out.println("this is catch block");
              e.printStackTrace();
          }
    
      finally{
        System.out.println("this is finally block");
      }
      System.out.println("exception handled");
    }
  }
//nested try
class ExceptionEx
  {
    public static void main(String args[])
    {
      try{
        //inner try block 1
        try
          {
            String s=null;
            System.out.println(s.contains("s"));
          }
        catch(NullPointerException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
        //inner try block 2
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(ArithmeticException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
      }
      catch(Exception e)
        {
          System.out.println("this is parent class");
        }
      System.out.println("exception handled");
    }
  }
class ExceptionEx
  {
    public static void main(String args[])
    {
      try{
        //inner try block 1
        try
          {
            String s=null;
            System.out.println(s.contains("s"));
          }
        catch(NullPointerException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
        //inner try block 2
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(ArithmeticException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
      }
      catch(Exception e)
        {
          System.out.println("this is parent class");
        }
      System.out.println("exception handled");
    }
  }
//Array Index Out Of Bound Exception
class ExceptionEx
  {
    public static void main(String args[])
    {
      int a[]={34,78,90,12,78};
      for(int i=0;i<=a.length;i++)
        {
          System.out.println(a[i]);
        }
    }
  }
//Null Pointer Excetpion
class ExceptionEx
  {
    public static void main(String args[])
    {
      String s=null;
      System.out.println(s.concat("hello"));
      
      
    }
  }
//Exception
class ExceptionEx
  {
    public static void main(String args[])
    {
      int a[]={56,12,89,90};
      try{
      for(int i=0;i<=a.length;i++)
        {
          System.out.println(a[i]);
        }
      }
      catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
          e.printStackTrace();
        }
      System.out.println("exception handled");
      System.out.println("welcome to bitlabs");
    }
  }

//Number Format Exception
class ExceptionEx
  {
    public static void main(String args[])
    {
      String s="123@a";
      int x=Integer.parseInt(s);
      System.out.println("x value:"+x);
          
      
    }
  }*/