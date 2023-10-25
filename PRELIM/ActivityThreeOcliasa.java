import java.util.Scanner;
import java.util.Random;

public class ActivityThreeOcliasa { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random orderCodeGenerator = new Random();
        int code = orderCodeGenerator.nextInt(10000);
        double dollar = 56.0; // exchange rate 
        double totalPrice = 0.0;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. C1 - Php 100.0");
            System.out.println("2. C2 - Php 150.0");
            System.out.println("3. C3 - Php 200.0");
            System.out.println("Add-ons:");
            System.out.println("4. R4 - Php 35.0");
            System.out.println("5. R5 - Php 50.0");
            System.out.println("0. Exit");
            System.out.println("Enter the item code from the Menu or 0 to exit: ");
            int userChoice = scan.nextInt();
            
            if (userChoice == 0) {
                System.out.println("Goodbye!");
                break;
            }
            
            double price = 0.0;
            String itemName = "";
            
            switch (userChoice) {
                case 1:
                    itemName = "C1";
                    price = 100.0;
                    break;
                case 2:
                    itemName = "C2";
                    price = 150.0;
                    break;
                case 3:
                    itemName = "C3";
                    price = 200.0;
                    break;
                case 4:
                    itemName = "R4";
                    price = 35.0;
                    break;
                case 5:
                    itemName = "R5";
                    price = 50.0;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            System.out.println("Quantity: ");
            double qty = scan.nextDouble();
            double itemTotalPrice = (price * qty) / dollar;
            totalPrice += itemTotalPrice;
            
            System.out.println("Quantity of the item ordered: " + qty);
            System.out.println("Price in Peso: Php" + price);
            System.out.println("Total Price: $" + String.format("%.2f", itemTotalPrice));
            System.out.println("Order Code: " + code);
            System.out.println();
            
            System.out.println("Do you want to order more? (1 for yes / 0 for no)");
            int continueOrder = scan.nextInt();
            
            if (continueOrder != 1) {
                System.out.println("Goodbye!");
                break;
            }
        }
        
        System.out.println("Total Price of all your orders: $" + String.format("%.2f", totalPrice));
    }
}
