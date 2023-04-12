package enkapsulasi;
import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println(".·:** ≈*≈ **:· Welcome to Tiny Supermart. The best mart in town! ·.·:** ≈*≈ **:·");
        System.out.println("                                                     ");
        System.out.print("Please enter your name, our dear customer. : ");
        String nama = input.nextLine();

        System.out.print("Now, please enter 10 digits of your CustomerNumber : ");
        String customerNumber = input.nextLine();

        String accountType = customerNumber.substring(0, 2);

        double saldo = 10000000;

        if (accountType.equals("38")) {
            System.out.println("Yeay, your account type is SILVER. Keep collecting more points to upgrade to Gold <3");
        } else if (accountType.equals("56")) {
            System.out.println("Hello there, customer with GOLD account type. Keep collecting more points to upgrade to Platinum <3");
        } else if (accountType.equals("74")) {
            System.out.println("You're loyal af!. Enjoy the PLATINUM type benefits dear <3");
        } else {
            System.out.println("Please enter a valid account number.");
            return;
        }

        Customer customer = new Customer(saldo, customerNumber, nama);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Wooho hello there " + nama + " with customerNumber: " + customerNumber);

        while (true) {
       
            System.out.println("What can we help you? Choose a number");
            System.out.println("1. Balance check");
            System.out.println("2. Top up");
            System.out.println("3. Purchase");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            
            if (choice == 1) {
                System.out.println("Your balance now is Rp" + customer.getSaldo());
            } else if (choice == 2) {
                System.out.println("How much do you want to top up? ");
                double amount = input.nextDouble();
                System.out.println("Enter your PIN: ");
                int pin = input.nextInt();
                customer.topUp(amount, pin);
            } else if (choice == 3) {
                System.out.println("How much is your purchase? ");
                double amount = input.nextDouble();
                System.out.println("Enter your PIN: ");
                int pin = input.nextInt();
                customer.pembelian(amount, pin);
            } else if (choice == 4) {
                System.out.println("Thank you for using our service and trusting us! Hope you have a nice day.");
                break;
            } else {
                System.out.println("Not valid. Choose between 1-4");
            }
        }
        
        input.close();
    }
    
}