import java.io.*;
import java.util.*;

class age{
   public static void main(String [] args){
   
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Your Age: ");

   int age= s.nextInt();
   if(age < 18 || age > 30){
    System.out.println("You are not eligible for this job.");
   } else{
     System.out.println("You are  eligible for this job.");
   }
}
}