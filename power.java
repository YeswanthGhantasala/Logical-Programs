/*import java.util.*;
class power
{
    public static void main(String args[])
    {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic number");
        int n=sc.nextInt();
       System.out.println("enter exponent number");
      int j=sc.nextInt();
       
        int result=1;
        for(; j!=0; --j)
        {
            result=result*n;
        }
        System.out.println("result is"+ result);
        
    }
}*/

import java.util.*;
class power
{
    public static void main(String args[])
    {
     
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=n;
      int d;
      int result=0;
      int sum=0;
      while(n!=0)
        {
          d=n%10;
          result=Math.pow(d,3);
          sum=sum+result;
          n=n/10;
        }
      if(p==sum)
        System.out.println("Armstrong");
      else
        System.out.println("not Armstrong");
        System.out.println();
    }
}