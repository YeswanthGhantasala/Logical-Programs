import java.util.*;
public class Common
  {
    public static void main(String args[])
    {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the elements");
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr2[]=new int[n];
      System.out.println("enter the array elements");
      
      for(int i=0; i<n; i++)
      {                        
          
       arr[i] = sc.nextInt();
        }
      System.out.println("enter another array elements");
      
      for(int j=0; j<n; j++)
        {
          arr2[j]=sc.nextInt();
        }
      System.out.println("common elements in both arrays are:");
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)

            {
              if(arr[i]==arr2[j])
                System.out.println(arr2[j]);
            }
        }
        }
  }
      