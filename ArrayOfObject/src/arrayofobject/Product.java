package arrayofobject;
import java.util.Scanner;
public class Product {
   int id;
   String pName;
   double unitPrice;   
   double salePrice;
   int quantiy;
   Scanner input;  // int a;
   public Product(){
     input = new Scanner(System.in);  // a =5;
   }
  public void inputAll(){
   id=input.nextInt();
   input.nextLine();
   pName=input.nextLine();
   unitPrice=input.nextDouble();
   salePrice=input.nextDouble();
   quantiy=input.nextInt();
  }
  public double getunitPrice(){
   return unitPrice;
  }
  public double getsalePrice(){
   return salePrice;
  }
  public int getquantiy(){
   return quantiy;
  }
}
