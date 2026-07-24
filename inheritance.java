import java.io.*;

class myclass1{
  public int a, b, c;
  public void intialize()
  {
   a=100; 
   b=50;
  }
 
 public void addition()
  {
    c=a+b;
    System.out.println("Addition result is: " + c);
  }

}

class myclass2 extends myclass1{
  public void sub()
  {
    c=a-b;
    System.out.println("Subtraction result is: " + c);
  }
}

class inheritance{
  public static void main(String []args){
    myclass2 m2=new myclass2();
    m2.intialize();
    m2.addition();
    m2.sub();
  }
}
    