package enkapsulasi;

public class Customer {
    private String nama;
    private double saldo;
    private String customerNumber;
    private int authenticationErrors = 0;
    private boolean isFrozen = false;
    
    public Customer(double saldo, String customerNumber, String nama) {
        this.saldo = saldo;
        this.customerNumber = customerNumber;
        this.nama = nama;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getCustomerNumber() {
        return customerNumber;
    }
    
    public String getNama() {
        return nama;
    }
    
    public boolean isFrozen() {
        return isFrozen;
    }
    
    public boolean isPinValid(int pin) {
        return true;
    }
    
    public void topUp(double amount, int pin) {

        if (!isPinValid(pin)) {
            authenticationErrors =  authenticationErrors + 1;
            if (authenticationErrors >= 3) {
                isFrozen = true;
                System.out.println("Sorry, your acc has been blocked. Call 123 for help.");
            }
            System.out.println("Wrong pin, this is your " + authenticationErrors + "/3" + "try.");
            return;
        }

        if (isFrozen()) {
            System.out.println("Sorry, your acc has been blocked. Call 123 for help.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Top up must be > 0");
            return;
        }
        
        setSaldo(getSaldo() + amount);
        System.out.println("Your top up with amount: " + amount + " has been made. Your balance now: Rp" + getSaldo());
    }
    
    public void pembelian(double amount, int pin) {
        if (isFrozen()) {
            System.out.println("Sorry, your acc has been blocked. Call 123 for help.");
            return;
        }
        
        if (!isPinValid(pin)) {
            authenticationErrors++;
            if (authenticationErrors >= 3) {
                isFrozen = true;
                System.out.println("Sorry, your acc has been blocked. Call 123 for help.");
            }
            System.out.println("Your purchase with amount: " + amount + " has been made. Your balance now: Rp" + getSaldo());
            return;
        }
        
        String accountType = customerNumber.substring(0, 2);
        double cashback = 0;
        
        if (accountType.equals("38")) {
            if (amount > 1000000) {
                cashback = amount * 0.05;
            }
        } else if (accountType.equals("56")) {
            if (amount > 1000000) {
                cashback = amount * 0.02;
                setSaldo(getSaldo() + cashback);
            }
        } else if (accountType.equals("74")) {
            if (amount > 1000000) {
                cashback = amount * 0.1;
                setSaldo(getSaldo() + cashback);
            }
            cashback = amount * 0.05;
        }
        
        if (amount <= 0) {
            System.out.println("Purchase must be greater than 0.");
            return;
        } else if (getSaldo() < 10000) {
            System.out.println("Minimum balance = 10,000");
            return;
            } else {
            setSaldo(getSaldo() - amount);
            setSaldo(getSaldo() + cashback);
            System.out.println("Payment with amount: " + amount + " has been made. Cashback " + cashback + " has been added to your acc. Your balance now: Rp" + getSaldo());
            }
            }
        }
