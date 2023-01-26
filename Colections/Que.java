import java.util.*;
class PQueueEx
  {
    public static void main(String args[])
    {
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
      pq.add(34);
      pq.add(90);
      pq.add(12);
      pq.add(45);
      pq.add(23);
      System.out.println(pq);
      pq.offer(77);
      System.out.println(pq);
      pq.remove();
      System.out.println(pq);
      pq.poll();
      System.out.println(pq);
      System.out.println(pq.element());        System.out.println(pq.peek());
     PriorityQueue<Integer> pq2=new PriorityQueue<Integer>();
    //  pq2.remove();
    //  System.out.println(pq2);
    //  pq.poll();
     // System.out.println(pq2);
      System.out.println(pq2.peek());
        
    }
  }