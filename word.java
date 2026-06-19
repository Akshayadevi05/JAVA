import java.io.*;
import java.util.*;

class word{
   public static void main(String [] args){
   
   Scanner s=new Scanner(System.in);
   System.out.println("Enter a Word: ");
   String word= s.nextLine();
   System.out.println("Enter a Word Meaning: ");
   String meaning= s.nextLine();
   
   if((word.equals("Tenacious") && meaning.equals("Never Give Up")) ||
        (word.equals("Obsolete") && meaning.equals("outdated")) ){
    System.out.println("You are Perfectly Correct.");
   } else{
     System.out.println("You are  wrong.");
   }
}
}