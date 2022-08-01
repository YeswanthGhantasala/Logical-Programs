public class String2
  {
    public static void main(String args[])
    {
     String s="Hi bitLabs";
      String x[]=s.split("");
      int st[]=new int[x.length];
      String maxx=x[0],minx=x[0];
      for(int i=0;i<x.length;i++){
        st[i]=x[i].length();
        
      }
  
      int max=st[0],min=st[0];
      for(int i=0;i<st.length;i++){
        if(max<st[i]){
        max=st[i];
        maxx=x[i];}
        
      }
      System.out.println("longest "+max+" "+maxx);
      for(int i=0;i<st.length;i++){
        if(min<st[i])
        min=st[i];
        minx=x[i];}
        System.out.println("smallest word"+min+" "+minx);
   }
  }
  