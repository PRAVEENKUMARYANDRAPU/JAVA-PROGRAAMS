class DistanceBtwPoints
  {
    public static void main(String args[])
    {
      int x1,x2,y1,y2;
      x1=91;
      x2=26;
      y1=78;
      y2=44;
      double dis=Math.sqrt((x2-x1)*(x2-x1)-(y2-y1)*(y2-y1));
      System.out.println("distance between the points is "+dis);
      
    }
  }