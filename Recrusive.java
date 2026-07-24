import java.io.*;

class Factorial
 {
   public static int factorial(int n)
     {
       if(n == 1){
          return 1;
       }
       else
        {
          return n * factorial(n-1);
        }
     }
 }

class Recrusive
 {
   public static void main(String[]args)
    {
      System.out.println(Factorial.factorial(5));
     }
  }
           

  