import java.io.*;

//no parameter, no return

class find{
  public void number(){
     int num=25;
     if(num % 2 == 0){
       System.out.println(num + " is even Number");
     }
     else{
       System.out.println(num + " is an odd Number.");
     }
  }
}

class oddeven1{
  public static void main(String[]args){
    find s1= new find();
    s1.number();
    
  }
}