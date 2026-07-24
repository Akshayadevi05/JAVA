import java.io.*;

abstract class teacher{

  public abstract void task1();
  public abstract void task2();
  
}

class students extends teacher
{
  public abstract void task1(){
   System.out.println("Task1 completed.");
 }
 
  public abstract void task2(){
   System.out.println("Task2 Competed.");
 }
}

class abstractmet{
 public static void main(String []args){
   teacher n1=new students();
   n1.task1();
   n1.task2();
 }
}