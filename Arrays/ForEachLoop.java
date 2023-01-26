
/* diamond
public class ForEachLoop {
//Add main method here
  public static void main(String args[])
{
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
  int i,j,k,m;
char ch=97;

 

//use for loop and if condition to print a,b,c 
  for(i=0;i<=2;i++)
     {
         for(m=i;m<=4;m++)
         {
             System.out.print("  ");
         }
         for(j=0;j<=i;j++)
         {
         System.out.print((char)(ch+j)+" ");
         }
         for(k=i-1;k>=0;k--)
         {
             System.out.print((char)(ch+k)+" ");
         }
        System.out.println();
     }
     for(i=1;i>=0;i--)
     {
         for(m=i;m<=4;m++)
         {
             System.out.print("  ");
         }
         for(j=0;j<=i;j++)
         {
         System.out.print((char)(ch+j)+" ");
         }
         for(k=i-1;k>=0;k--)
         {
             System.out.print((char)(ch+k)+" ");
         }
        System.out.println();
     }
}

}
/*
name/*
class ForEachLoop
  {
    public static void main(String args[])
    {
        String num[]={"dfgfdfg","dfg","fdgg","fgdg"};
      System.out.println("array elements are");
      for(String a:num)
        {
          System.out.println(a+" ");
        }
   }
  }
/*for each loop
class ForEachLoop
  {
    public static void main(String args[])
    {
      float arr[]={30.2f,23.5f,12.5f,36.5f};
      System.out.println("array elements are");
      for(float x:arr)
        {
          System.out.print(x+" ");
        }
    }
  }*/