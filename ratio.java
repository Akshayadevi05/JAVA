import java.io.*;
import java.util.*;

class ratio{
  public static void main(String []args){

    Scanner s=new Scanner(System.in);

    System.out.println("Enter Boys Ratio: ");
    int boysratio=s.nextInt();

    System.out.println("Enter Girls Ratio: ");
    int girlsratio=s.nextInt();
    
     System.out.println("Enter Total Students: ");
     int totalstudents=s.nextInt();
    

    int totalboys=( (boysratio * totalstudents)/(boysratio + girlsratio));
    int totalgirls=((girlsratio * totalstudents)/(boysratio + girlsratio));
    
    System.out.println("Total Boys: " + totalboys);
 System.out.println("Total Girls: " + totalgirls);
   }
}