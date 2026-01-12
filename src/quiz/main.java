package quiz;
import java.util.Scanner;

public class main {

    public static boolean sendProduct() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter IBAN:");
            String iban = scanner.nextLine();

            if (iban.length() != 16) {
                System.out.println("Iban should be 16 digit");
                continue;
            }

            boolean allDigits = true;
            for (int i = 0; i < iban.length(); i++) {
                if (!Character.isDigit(iban.charAt(i))) {
                    allDigits = false;
                    break;
                }
            }

            if (!allDigits) {
                System.out.println("Iban should contain only digits");
                continue;
            }

            // IBAN doğru
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            System.out.println("Product has been sent to: " + address);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your product name:");
        String name = scanner.nextLine();

        System.out.println("Enter quantity:");
        int number = scanner.nextInt();
        scanner.nextLine();

        Product product1 = new Product(name, number);
        product1.displayProductInfo();
        product1.total();

        System.out.println("Do you want to buy these?\nYES or NO please");
        String answer = scanner.nextLine();

        switch (answer) {
            case "YES":
                boolean ibanok = sendProduct();
                if (ibanok) {
                    ShoppingBasket basket1 = new ShoppingBasket();
                    basket1.updatestock(product1);
                }
                break;

            case "NO":
                System.out.println("You don't accept total price");
                break;

            default:
                System.out.println("Please type YES or NO");
        }
    }
}
