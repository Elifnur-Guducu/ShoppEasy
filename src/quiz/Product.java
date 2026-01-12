
package quiz;

public class Product {
    String productname;
    int quantity;
    double price=87.55;


    public Product(String productname, int quantity){
       this.productname=productname;
       this.quantity=quantity;

    }
    public void displayProductInfo(){
        System.out.println("Product name:"+productname
                           +"\n"+"Quantity:"+quantity);
    }
    public void total(){
        System.out.println("Total:"+(this.price*quantity));
    }

}

