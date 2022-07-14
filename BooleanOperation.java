
import java.util.Scanner;

public class BooleanOperation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x as boolean value(true/false): ");
        boolean x=sc.nextBoolean();
        System.out.println("Enter y as boolean value(true/false): ");
        boolean y=sc.nextBoolean();
        System.out.println("x&&y is= "+(x&&y));
        System.out.println("x||y is= "+(x||y));
        System.out.println("!x is= "+(!x));
        System.out.println("!y is= "+(!y));
        
    }

}