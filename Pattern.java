import java.util.*;
public class Pattern 
{
public static void main (String args[])
{
int i,row;
Scanner sc =  new Scanner(System.in);
System.out.println("enter number of rows");
i=sc.nextInt();
for(row=1; row<=i; row++)
{
for(int j=1; j<=row; j++)
{
System.out.print(row+" ");
}
System.out.println(" ");
}
}
}