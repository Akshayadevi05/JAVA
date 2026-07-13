import java.io.*;
//no parameter, no return
class student{
 public void addition(){ // method implimentation
   int a = 100, b=200;
   int c= a+b;
   System.out.println("Addition result is " + c);
 }
}

class method1{
   public static void main(String[]args){
      student s1=new student();
      s1.addition(); //method call
  }
}