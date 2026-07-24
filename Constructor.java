import java.io.*;

class myclass
 {
  private int a,b,c;
  
    public myclass()
    {
     a=100;
     b=200;
    }
  public void addition()
   {
     c=a+b;
     System.out.println("addition result is " + c);
  }
 }

class Constructor{
  public static void main(String []args)
   {
     myclass m1=new myclass();
     m1.addition();
   }
}