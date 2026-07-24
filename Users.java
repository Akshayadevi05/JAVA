import java.io.*;
import java.util.*;

class LogIn
{
  private String User_name;
  private int User_Password;
  
  public void user_details()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your UserName: ");
      User_name=sc.next();
      System.out.println("Enter Your Password: ");
      User_Password=sc.nextInt();
    }

  public void print_details()

    {
      System.out.println("User Name: " + User_name);
      System.out.println("User Password: " + User_Password);
 
    }
}

class Users{
  public static void main(String []args)
  {
    LogIn user1= new LogIn();
    LogIn user2= new LogIn();

    user1.user_details();
    user1.user_details();

    user1.print_details();
    System.out.print("\n");
    user1.print_details();
 }
}
  
 


