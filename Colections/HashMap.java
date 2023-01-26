
/*import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); 
      System.out.println(hm);
      hm.putIfAbsent(7,"cherries");
      System.out.println(hm);
      HashMap<Integer,String> hm1=new HashMap<Integer,String>();
      hm1.putAll(hm);
      System.out.println(hm1);
    }
  }
/*import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); 
      System.out.println(hm);
      hm.putIfAbsent(7,"cherries");
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
      if(hm.containsValue("apple"))
      {
        System.out.println("value is found");
      }
      else
      {
        System.out.println("value is not found");
      }
      if(hm.containsKey(7))
      {
        System.out.println("key is found");
      }
      else
      {
        System.out.println("key is not found");
      }
    }
  }
/*//remove()
import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); 
      System.out.println(hm);
      hm.remove(5);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }
  }
/*import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); //It accepts duplicate values
      hm.put(2,"berries");  //It doesnot accepts duplicate keys
      hm.put(6,null); //accepts null values"
      hm.put(null,"tomato"); //It accpets only one null key
      hm.put(null,"potato");
      System.out.println(hm);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }
  }
/*import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");
      hm.put(3,"banana");
      hm.put(4,"grapes");
      System.out.println(hm);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }
  }*/
/*import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");
      hm.put(3,"banana");
      hm.put(4,"grapes");
      System.out.println(hm);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }
  }