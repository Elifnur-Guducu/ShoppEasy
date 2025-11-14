package quiz;

public class ShoppingBasket {
    int stock=10;

   public void updatestock(Product product2){
       if (product2.quantity<=stock){
           stock=stock-product2.quantity;
           System.out.println("Current stock:"+stock);

       }else{
           System.out.println("Stock is not enough :(");
       }


   }




}
