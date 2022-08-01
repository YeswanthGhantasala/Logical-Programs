import java.util.*;
class SecondLargest
  {
    public static void main(String args[])
    {
      int n,i,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of an Array");
      n=sc.nextInt();

     

      int arr[]=new int[n];
     
       
      for(i=0;i<n;i++)
        {
          System.out.print("Enter Array Elements of arr"+"["+i+"]:");
           arr[i]=sc.nextInt();
          
        }
    
     
    for(i=0;i<n;i++)
       for(int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
         
            }
        }
    System.out.println("Second largest number: "); 
   System.out.println(arr[n-2]); 
    
}
}