import java.io.*;

class profit{
  public static void main(String []args){
    
     int Cost_Price = 1100;
     int Selling_Price = 1500;
     int Profit = (Selling_Price - Cost_Price);
     double Percentage = ((Profit*100.0)/Cost_Price);

     System.out.println("Profit: " + Profit);
     System.out.println("Percentage: " + Percentage + "%");
  }
}
     