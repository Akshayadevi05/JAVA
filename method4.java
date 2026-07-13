import java.io.*;
//no parameters, with return

class student{
  public int addition(){
     int a=200, b=300;
     int c=a+b;
     return c;
 }
}

class method4{
  public static void main(String[]args){
    student s1= new student();
    
    int result=s1.addition();
    System.out.println("output is "+ result);
  }
}