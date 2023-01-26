//WAP to find total number of alphabets, digits or special character in a string.//
class TotalNumOfANC
  {
    public static void main(String args[])
    {
      String s="praveen@10";
      int acount=0,bcount=0,fcount=0;
      for(int i=0;i<s.length();i++)
        {
          if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
          {
            acount++;
          }
          else if (s.charAt(i)>='0'&&s.charAt(i)<='9')
          {
            bcount++;
          }
          else{
          fcount++;
          }
        }
      System.out.println("alphabet count is"+acount);
      System.out.println("number count is"+bcount);
      System.out.println("character count is"+fcount);
      
        
    }

	
  }