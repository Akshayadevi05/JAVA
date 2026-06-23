import java.io.*;
import java.util.*;

class operator{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
     
    System.out.println("Enter a Number: ");
    int num = s.nextInt();
   
    System.out.println("Choose an Option:");
    System.out.println("1.Square");
    System.out.println("2.Cube");
    int choice = s.nextInt();

    switch(choice){
      case 1:
        System.out.println("Result: " + (num * num));
        break;
      case 2:
        System.out.println("Result: " + (num*num*num));
        break;
      default:
        System.out.println("Invalid");
     }
  }
}