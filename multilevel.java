import java.io.*;

class animal{
   public void name(){
     System.out.println("Animal is cat.");
   }
}

class cat extends animal{
     public void name2(){
     System.out.println("Animal is kitty.");
   }
}

class kitty extends cat{
     public void display(){
     System.out.println("Animal is Tiger.");
   }
}
  
 class multilevel{
   public static void main(String[]args){
     kitty k=new kitty();
     k.name1();
      k.name2();
     k.display();  
   }
}