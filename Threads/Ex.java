/*// one method
class Mythread extends Thread
  {
  public void run()
    {
  for (int i=1;i<=10;i++)
  {
    System.out.println("praveen");
  }
}
  }
public class Ex
  {
    public static void main(String args[])
    {
      Mythread t=new Mythread(); 
       t.start();
   //   t.run();
      for (int i=1;i<=10;i++)
        {
        System.out.println("kumar");
        }
    }
  }*/
class MyRunnable implements Runnable
  {
  public void run(){
  for (int i=0;i<=10;i++)
  {
  System.out.println("PRAVEEN");
  }
  }
}
public class Ex
  {
    public static void main(String args[])
    {
      MyRunnable s=new MyRunnable();
     Thread t=new Thread(s);
      t.start();
      for(int i=0;i<=10;i++)
      {
        System.out.println("kumar");
      }
    }
  }
  