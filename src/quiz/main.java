package quiz;
import java.util.Scanner;

public class main {
    public static boolean sendProduct(){
        Scanner scanner = new Scanner(System.in);
        boolean kontrol = true;
        System.out.println("Enter IBAN:");
        String iban = scanner.nextLine();
        if (iban.length() == 16) {
            for (int i = 0; i < iban.length(); i++) {
                char karakter = iban.charAt(i);
                if (Character.isDigit(karakter)) {
                    kontrol = true;
                } else {
                    kontrol = false;
                    break;
                }
            }
            if(kontrol){
                System.out.println("Enter adresses:");
                String adresses=scanner.nextLine();
                System.out.println("Product has been sent to:"+adresses);
            }else{
                System.out.println("Iban should be digit");
            }

        }else{
             System.out.println("Iban should be 16 digit");

        }
        return kontrol;

    }
    public static void main(String[] args) {
        // metodun içine başka bir metot yazamayacağım için diğer metodu class içinde ama main metodu dışında tanımlıyorum.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your product name:");
        String name = scanner.nextLine();
        System.out.println("Enter quantity:");
        int number = scanner.nextInt();
        scanner.nextLine();
        Product product1 = new Product(name, number);
        product1.displayProductInfo();
        product1.total();
        System.out.println("Do you want to buy these?\n" + "YES or NO please");
        String answer = scanner.nextLine();
        switch (answer) {
            case "YES":
                boolean ibanok=sendProduct();
                if(ibanok) {
                    ShoppingBasket basket1 = new ShoppingBasket();
                    basket1.updatestock(product1);
                }
                break;
               case "NO":
                   System.out.println("You don't accept total price");

        }


    }
}

