import java.io.*;

//no parameter, with return type

class find{
  public int number(){
    int num = 22;
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

class oddeven4{
  public static void main(String []args){
    find s1 = new find();
     s1.number();
  }
}
    
    