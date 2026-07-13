import java.io.*;

//with parameter, with return type

class find{
 public int number(int num){
   if(num % 2 == 0)
   {
     System.out.println(num + " is a even Number.");
   }
   else
   {
     System.out.println(num + " is an odd Number.");
   }
  return num;
 }
}

class oddeven3{
  public static void main(String []args){
     find s1= new find();
     int num = 39;
     s1.number(num);
     
  }
}