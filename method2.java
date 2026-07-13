import java.io.*;
// with parametr, no return

class student{
   public void addition(int a, int b){ //formal parameter
     int c=a+b;
     System.out.println("Addition is " +  c);
   }
}

class method2{
   public static void main(String[]args){
      student s1 = new student();
      int a =1000, b=2000;
      s1.addition(a, b); //actaul parameter
   }
}
