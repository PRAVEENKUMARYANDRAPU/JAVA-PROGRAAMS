class Ex
  {
    public static void main(String args[])
    {
      String s= "praveen10@";
      try 
        {
      int x=Integer.parseInt(s);
      System.out.println(x);
          
    }
       
      catch(NumberFormatException e)
        {
            System.out.println("this is number format exception");
        }
       System.out.println("welcome");
    }   
  }