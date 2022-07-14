import java.util.*;
public class Copy
{
public static void main (String args[])
{
int i,n;
Scanner sc =  new Scanner(System.in);
System.out.println("enter size of array");
n=sc.nextInt();
  int a[] = new int[n];
  int b[]= new int[n];
    System.out.println("enter array element");
  
for(i=0; i<n; i++)
{
  a[i]=sc.nextInt();
}
  
for(i=0; i<n; i++)
{
  b[i]=a[i];
}
  for(i=0; i<n;i++)
  {
    System.out.print(a[i]);
}
}}