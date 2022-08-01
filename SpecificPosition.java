import java.util.*;
public class SpecificPosition
  {
    public static void main(String args[])
    {
      int arr[] = new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the elements");

      for(int i=0; i<arr.length-1; i++)
        {                        
          
       arr[i] = sc.nextInt();
        }
      System.out.println("printing element before insert");
      
      for(int i: arr)
        
        {
          System.out.println(i);
          }
      System.out.println("enter the loc at which we want to insert");
      int loc = sc.nextInt();
      System.out.println("enter the value at which we want to insert");
      int value = sc.nextInt();
      for(int i = arr.length-1; i>loc; i--)
        {
          arr[i] = arr[i-1];
        }
      arr[loc]=value;
      for(int i : arr)
        {
        System.out.println(i);
        }
    }
  }
        
    