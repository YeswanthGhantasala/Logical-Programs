import java.util.*;
public class Tokenizer
  {
    public static void main(String args[])
    {
      /* StringTokenizer st = new StringTokenizer("my name is yash :"," ");
      while(st.hasMoreTokens()){ 
        System.out.println(st.nextToken()); */
      String s= "hello World";
        String s1=" ";
        for(int i=s.length()-1; i>=0;i-- )
        {
          
          s1=s1+s;
        
          
        }
        System.out.print(s1);
    }}