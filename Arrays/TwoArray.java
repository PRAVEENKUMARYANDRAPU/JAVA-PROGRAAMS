import java.util.*;
class TwoD
  {
  public static void main(String args[]){
   int r,c;
    Scanner sc=new Scanner(System.in);//1 mat
    System.out.println("the rows size  and colum size :");
    r=sc.nextInt();
    c=sc.nextInt();
   int a[][]=new int[r][c];
    System.out.println("enter the values in to first array");
    for(int i=0;i<r;i++) //for rows
      {
        for(int j=0;j<c;j++)//foe colum
          {
           a[i][j]=sc.nextInt();
          }
      }
    System.out.println("the rows size  and colum size for the second array :");//2 mat
    int x=sc.nextInt();
    int y=sc.nextInt();

 

    int arr[][]=new int[x][y];
    System.out.println("enter the values in to Second array");

        for(int i=0;i<x;i++) //for rows
      {
        for(int j=0;j<y;j++)//foe colum
          {
           arr[i][j]=sc.nextInt();         
         }   
      }
    int sum[][]=new int[r][c];
    for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          {
            sum[i][j]=a[i][j]+arr[i][j];
          }

      }
  System.out.println("enter the resultant array elements");
   for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          {
            System.out.print(sum[i][j]+" ");
          }
        System.out.println();
        }

  }
}
/*adding
import java.util.*;
class TwoArray
  {
    public static void main(String args[])
    {
      int a[][]={{25,24},{74,85}};
      int b[][]={{41,63},{56,63}};
      int c[][]=new int[2][2];
      for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
          {
           c[i][j]= a[i][j]+b[i][j];  
          }
     }
       for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
          {
      System.out.print(c[i][j]+ " " );
    }
        System.out.println(" ");
  }
 }
  }
    
      

/*2D array Example
import java.util.*;
class TwoArray
  {
    public static void main(String args[])
    {
      int r,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size and column size");
      r=sc.nextInt();
      c=sc.nextInt();      
      int a[][]=new int[r][c];
      System.out.println("enter the values in to 2D array");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("the array element are");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              System.out.print("["+i+"]["+j+"]: "+a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }
    
/* to print with 00 11
class TwoArray
  {
    public static void main(String args[])
    {
      
     int a[][]= {{54,78,95},{87,95,98}};
      System.out.println("the array element are");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
    System.out.print("["+i+"]["+j+"]: "+a[i][j]+"");
            }
          System.out.println();
        }
    }
  }
/* simple  direct values
class TwoArray
  {
    public static void main(String args[])
    {
      
     int a[][]= {{54,78,95},{87,95,98}};
      System.out.println("the array element are");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }
/* float example
class TwoArray
  {
    public static void main(String args[])
    {
      float a[][]=new float[2][3];
      a[0][0]=98.2f;
      a[0][1]=87.25f;
      a[0][2]=8.25f;
      a[1][0]=889.3f;
      a[1][1]=88.6f;
      a[1][2]=87.25f;
      System.out.println("the array element are");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }
/*2D array Example
class TwoArray
  {
    public static void main(String args[])
    {
      int a[][]=new int[2][2];
      a[0][0]=34;
      a[0][1]=45;
      a[1][0]=78;
      a[1][1]=56;
      System.out.println("the array element are");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }*/