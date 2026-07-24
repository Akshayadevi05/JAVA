import java.io.*;
import java.util.*;

class ATM_Template
{
  private String bank_name;
  private String account_holder;
  private int account_no;
  private int renewal_year;

public void Atm_Details()
{
  System.out.println("Enter Bank Name, Account Holder, Account No, Renewal Year");
  Scanner sc = new Scanner(System.in);
  
  bank_name=sc.next();
  account_holder=sc.next();
  account_no=sc.nextInt();
  renewal_year=sc.nextInt();
}

public void print_details()

{
  System.out.println("Bank Name: " + bank_name);
  System.out.println("Account Holder: " + account_holder);
  System.out.println("Account No: " + account_no);
  System.out.println("Renewal Year: " + renewal_year);
}
}

class AtmCard{
  public static void main(String []args)
  {
    ATM_Template customer1= new ATM_Template();
    customer1.Atm_Details();
    customer1.print_details();
 }
}
  
 


