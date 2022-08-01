public class Replace
  {
    public static void main(String args[]){
    String s= "  Abcbef AAA  123";
    System.out.println("Replace the value : " + s.replace('a','2'));
    System.out.println("ReplaceAll the value : " + s.replaceAll("b","3333333"));
    System.out.println("SubString :" +s.substring(2,5));
    System.out.println("Lower Case :" +s.toLowerCase());
    System.out.println("Upper Case :" +s.toUpperCase());
    System.out.println("Trim :" +s.trim());
    System.out.println("Split :" +s.split("3"));
      int i=45;
     String s1=Integer.toString(i);
    System.out.println("String :" +s1);
      }
  }