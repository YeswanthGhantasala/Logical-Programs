import java.util.*;
class Sum
{
public static void main(String args[])
{
int n,k, sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter size of array");
  n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter array element");
for(k=0;k<n;k++)
arr[k]=sc.nextInt();
for(k=0; k<n; k++)
  {
sum=sum+arr[k];
  }
  System.out.println("sum of all element in array :"+sum);
}
}




