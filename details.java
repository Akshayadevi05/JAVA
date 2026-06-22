import java.io.*;
import java.util.*;

class details{
  public static void main(String[]args){
    System.out.println("Enter a number, color and Country: ");
    Scanner s = new Scanner(System.in);
    
    int num = s.nextInt();
    s.nextLine();
    String color = s.nextLine();
    String country = s.nextLine();

    if(num == 11 && (color.equals("yellow") && country.equals("africa"))){
      System.out.println("You are Invited to Africa");
    }
    
    else if(num == 15 && (color.equals("Red") && country.equals("London"))){
      System.out.println("You are Invited to London");
    }
    
    else if(num == 24 && (color.equals("Black") && country.equals("Netherland"))){
      System.out.println("You are Invited to Netherland");
    }

    else{
      System.out.println("Invalid");
    }
 }
}