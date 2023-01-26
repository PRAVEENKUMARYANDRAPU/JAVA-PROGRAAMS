/*Method overloading
class AreaCalculation
  {
    void calculateArea(int a)
    {
      System.out.println("area of the square");
      int result=a*a;
      System.out.println(result);
    }
    void calculateArea(int l,int b)
    {
      System.out.println("area of the rectangle");
      int result=l*b;
       System.out.println(result);
    }
    void calculateArea(double r)
    {
      System.out.println("area of the circle");
      double result=3.14*r*r;
       System.out.println(result);
    }
    public static void main(String args[])
    {
      AreaCalculation ac=new AreaCalculation();
      ac.calculateArea(3); //
      ac.calculateArea(12,5);
      ac.calculateArea(4.0);
      
    }
  }
/*Method overloading
class PolyExample
  {
    public int sum(int x,int y)
    {
      int z=x+y;
     return z;
    }
    public double sum(double p,double q)
    {
      double w=p+q;
      return w;
    }
    public static void main(String args[])
    {
      PolyExample obj=new PolyExample();
      int sum=obj.sum(10,20);
      double result=obj.sum(12.3,10.5);
      System.out.println(sum);
      System.out.println(result);
    }
  }
/*class PolyExample
  {
    void sum(int x,int y)
    {
      int z=x+y;
      System.out.println("the sum is"+(z));
    }
    void sum(int x,int y,int z)
    {
      int w=x+y+z;
      System.out.println("the sum is"+(w));
    }
    public static void main(String args[])
    {
      PolyExample obj=new PolyExample();
      obj.sum(10,20);
      obj.sum(10,20,30);
    }
  }*/