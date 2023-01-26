abstract class Operation
  {
    abstract public int arithmetic();
  }
class Sum extends Operation
  {
    public int arithmetic()
    {
      int a=3254,b=1632,c;
      return c=a+b;
    }
  }
class Mul extends Operation
  {
    public int arithmetic()
    {
      int a=1872,b=482,c;
      return c=a*b;
     }
  }
class Ex
  {
    public static void main(String args[])
    {
      Sum su=new Sum();
      Mul mu=new Mul();
      System.out.println("the sum of 2 numbers is : "+su.arithmetic());
      System.out.println("the mul of 2 numbers is : "+mu.arithmetic());
     }
  }



/*abstract class Bank
  {
    abstract public int rateOfInterest();
  }
class SBI extends Bank
  {
    public int rateOfInterest()
    {
      return 7;
    }
  }
class PNB extends Bank
  {
    public int rateOfInterest()
    {
      return 12;
    }
  }
class Ex
  {
    public static void main(String args[])
    {
      SBI sb=new SBI();
      PNB pb=new PNB();
      System.out.println("rate of interest for sbi is:"+sb.rateOfInterest()+"%");
      System.out.println("rate of interest for sbi is:"+pb.rateOfInterest()+"%");
      
    }
  }
/*abstract class Emp
  {
    abstract public void pp();
    public void oo()
    {
      System.out.println("sf");
    }
  }
class Omp extends Emp
  {
 public void pp()
    {
      System.out.println("af");
    }
    public void uu()
    {
      System.out.println("sdsdf");
    }
  }
class Ex
  {
  public static void main(String args[])
  {
    Omp obj=new Omp();
    obj.uu();
    obj.pp();
  }
  }
/*abstract class
abstract class Sample
  {
    abstract public void show();
    public void display()
    {
      System.out.println("hi helllo welcome");
    }
        
  }
class Main extends Sample
  {
     public void show()
    {
      System.out.println("this is a abstract method implementation");
    } 
  }
class AbstractEx
  {
    public static void main(String args[])
    {
      Main obj=new Main();
     // obj.show();
      obj.display();
    }
  }*/
/*
abstract class Sample
  {
    abstract public void show();
        
  }
class Main extends Sample
  {
      public void show()
    {
      System.out.println("this is a abstract method implementation");
    }
  }
class AbstractEx
  {
    public static void main(String args[])
    {
      Main obj=new Main();
      obj.show();
    }
  }*/