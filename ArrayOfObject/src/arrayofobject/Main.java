package arrayofobject;
public class Main {
 public static void main(String[] args) {
  /* Product obj1= new Product();
   Product obj2= new Product();
   Product obj3= new Product();
   obj1.inputAll();
   obj2.inputAll();
   obj3.inputAll();   
   */
   Product[] pro= new Product[3];
   for (int i = 0; i < 3; i++) {
    pro[i]= new Product();
   }
   for (int i = 0; i < 3; i++) {
   System.out.println("input "+i+" object value:");   
    pro[i].inputAll();
   }
   // total quantity in res
   int quan=0; 
   for (int i = 0; i < 10; i++) {
      quan=quan+pro[i].quantiy;
   }
  // total cost
   double totalcost=0.0;
   for (int i = 0; i < 10; i++) {
      totalcost=totalcost+pro[i].unitPrice*pro[i].quantiy;
   }
  
   
     // pro[0]= new Product();
  // pro[1]= new Product();
  // pro[2]= new Product();
   // pro[0].inputAll();
    // pro[1].inputAll();
    // pro[2].inputAll();
 } 
}
