
/* delete

import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int a[]={23,56,34,90,45};
     // int size=a.length;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element positon to remove");
      int pos=sc.nextInt();
      for(int i=0;i<a.length-1;i++)
        {
          if(pos==i)
          {
            a[i]=a[i+1];
          }
          else if(i>pos)
            a[i]=a[i+1];
        else
            a[i]=a[i];
        }
     size--;
      System.out.println("the elements after remove");
      for(int i=0;i<a.length-1;i++)
        {
          System.out.print(a[i]+" ");
        }

    }
  }
/* insert
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      int arr[]=new int[size];
      int newarr[]=new int[size+1];
      System.out.println("enter the elements ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the position of element you want to insert");
      int pos=sc.nextInt();
      System.out.println("enter the element you want to insert");
      int ele=sc.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          if(i==pos)
          {
            newarr[i]=ele;
            newarr[i+1]=arr[i];
          }
          else if(i<pos)
          {
            newarr[i]=arr[i];
          }
          else
            newarr[i+1]=arr[i];
        }
      System.out.println("after inserting the element");
      for(int i=0;i<newarr.length;i++)
        {
          System.out.print(newarr[i]+" ");
        }
    }
  }
/* soring in assending order
class ArrayExample
{
public static void main(String args[])
{
int arr[]={10,32,23,45,89,56};
int temp=0;
System.out.println("elements before sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
  System.out.println();
System.out.println("elements after sorting");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}
/*Frequency of elements in the array.
class ArrayExample
  {
    public static void main(String args[])
    {
      int a[]={2,3,2,1,4,3,2};
      int count;
      int n=a.length;
      boolean visited[]=new boolean[n];
      for(int i=0;i<n;i++)
        {
          visited[i]=false;
        }
    System.out.println("the array elements are");
      for(int i=0;i<a.length;i++)
        {
          count=1;
          if(visited[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
          System.out.println("the frequency of "+a[i]+ "-------------"+count);
        }
    }
  }

/*import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size number");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
             {
               if(arr[i]==arr[j])
               {
                 System.out.println(arr[j]+"the dupulicate num is");
               }
             }
        }
    }
  }

      /* minimum num
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int min,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      min=arr[0];
          for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
            min=arr[i];
          }
        }
      System.out.println("the min element in the array is:"+min);
    }
  }
/*Maximum element from the array
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int max,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      max=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
        }
      System.out.println("the maximum element in the array is:"+max);
          
  }
  }
/* printing index value

import java.util.*;
  class ArrayExample
   {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
   System.out.println("the size ofthe array is : ");
      size=sc.nextInt();
      int a[]=new int[size];
      int count=0;
      System.out.println("enter array elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the array elements are : ");
      for(int i=0;i<a.length;i++)
        {
      if(i%2==0)
      {
        count++;
    System.out.print(a[i]+" ");     
      }
        }
      System.out.println(" the count of array is "+count);
    }
   }
/* positive num

import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<a.length;i++)
        {
      if(a[i]>0)
      {
        
         System.out.println("print the negatative values : "+a[i]);
      }
        }
      
    }
    
  }
/* negative num

import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<a.length;i++)
        {
      if(a[i]<0)
      {
        
         System.out.println("print the negatative values : "+a[i]);
      }
        }
      
    }
    
  }

/*odd number
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<a.length;i++)
        {
      if(a[i]%2==0)
      {
        count++;
         System.out.println("print the even values : "+a[i]);
      }
        }
      System.out.println("the count is: "+count);  
    }
    
  }


/* odd number
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<a.length;i++)
        {
      if(a[i]%2!=0)
      {
         System.out.println("print the even values : "+a[i]);
      }
        }
    }
      
  }

/* even numbers
import java.util.*;
class ArrayExample
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the values");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<a.length;i++)
        {
      if(a[i]%2==0)
      {
         System.out.println("print the even values : "+a[i]);
      }
        }
    }
      
  }

  /* size of array
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    int size;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
     size=sc.nextInt();
      int a[]=new int[size];
    
    System.out.println("enter the elements");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("the elements are");
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println(" the length of array is :"+a.length);
  }
}

/* length of array
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    int a[]=new int[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    for(int i=0;i<4;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("the elements are");
    for(int i=0;i<4;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println(" the length of array is :"+a.length);
  }
}

/* usingcharat
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    char ch[]=new char[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    for(int i=0;i<4;i++)
    {
      ch[i]=sc.next().charAt(0);
    }
    System.out.println("the elements are");
    for(int i=0;i<4;i++)
    {
      System.out.print(ch[i]+" ");
    }
  }
}
/* using string
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    String a[]=new String[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    for(int i=0;i<4;i++)
    {
      a[i]=sc.next();
    }
    System.out.println("the elements are");
    for(int i=0;i<4;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}

/* using keyboard shoet cut
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    int a[]=new int[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    for(int i=0;i<4;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("the elements are");
    for(int i=0;i<4;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}

/*  using keyboard
import java.util.*;
class ArrayExample
{
  public static void main(String args[])
  {
    int a[]=new int[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    a[0]=sc.nextInt();
    a[1]=sc.nextInt();
    a[2]=sc.nextInt();
    a[3]=sc.nextInt();
    System.out.println("the elements are");
    for(int i=0;i<4;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}
  
/* printing names
class ArrayExample
  {
    public static void main(String args[])
    {
      String arr[]={"praveenkumar","bannu","yandrapu","eead","asdads"}; //declaration
     
      System.out.println("array elements are");
   for(int i=1;i<5;i++)
     {
       System.out.println(arr[i]);
     }
    }
  }

/* using forloop
class ArrayExample
  {
    public static void main(String args[])
    {
      float arr[]={34.5f,67.8f,90.5f,12.3f,42.5f}; //declaration
     
      System.out.println("array elements are");
   for(int i=1;i<5;i++)
     {
       System.out.println(arr[i]);
     }
    }
  }
/*class ArrayExample
  {
    public static void main(String args[])
    {
      float arr[]={34.5f,67.8f,90.5f,12.3f,42.5f}; //declaration
     
      System.out.println("array elements are");
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      System.out.println(arr[4]);
    }
  }

/*basic
class ArrayExample
  {
    public static void main(String args[])
    {
      int arr[]=new int[5]; //declaration
      arr[0]=23; //initialization
      arr[1]=45;
      arr[2]=56;
      arr[3]=90;
      arr[4]=30;
      System.out.println("array elements are");
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      System.out.println(arr[4]);
    }
  }*/