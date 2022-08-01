class Acct{
  void display(){
   
    int balance =1;
    String account_number="74163";
    
    System.out.println("balance,  account_number");
    System.out.println(balance+ " "  +account_number);
  }/*
  void display2(){
    String Name="John";
    int roll_no=2;
    String phone="93937";
    String address="Beach raod";
    System.out.println("Name, roll_no, phone, Address of Student");
    System.out.println(Name+"     "+roll_no+"     "+phone+"     "+address);
  }*/
  public static void main(String args[]){
  Acct jhon=new Acct();
  jhon.display();
    //System.out.println();
    //System.out.println();
  //st2.display2();  
}
}
