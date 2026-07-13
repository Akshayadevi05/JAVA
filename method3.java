import java.io.*;
//with parameters, with return

class student{
  public int addition(int a, int b){
     int c=a+b;
     return c;
 }
}

class method3{
  public static void main(String[]args){
    student s1= new student();
    int a = 1000, b=220;
    int result=s1.addition(a,b);
    System.out.println("output is "+ result);
  }
}