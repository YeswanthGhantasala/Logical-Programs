class Oops {
int a;
int b;
int c;
  Oops(){
    a=3;
    b=4;
    c=5;
}
double Area()
  {
  double s=(a+b+c)/2;
  double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  return d;
  }
double per()
  {
  double p=(a+b+c);
  return b;  
  }
public static void main(String args[]){
  Oops t=new Oops();
  System.out.println("Area of triangle"+t.Area());
System.out.println("Perimeter of triangle"+t.per());
}}
  