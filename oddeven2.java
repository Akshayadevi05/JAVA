import java.io.*;

//with parameter, no return type

class find{
  public void number(int a){
     
     if(a % 2 == 0){
       System.out.println(a + " is even Number");
     }
     else{
       System.out.println(a + " is an odd Number.");
     }
  }
}

class oddeven2{
  public static void main(String[]args){
    find s1= new find();
    int a=56;
    s1.number(a);
    
  }
}