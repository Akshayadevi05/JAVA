//Virtual Method

import java.io.*;

class order1{
 public void main(){
   System.out.println("Ordered Naan");
 }
 public void starter(){
   System.out.println("Ordered Panner Tikka.");
 }
}

class order2 extends order1
{
public void starter(){
   System.out.println("Ordered Prawn Gravy.");
 }
}

class Virtualmet{

public static void main(String []args){
  order1 n1=new order2();
  
  n1.main();
  n1.starter();
 }
}