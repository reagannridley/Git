package sistem;

public class Main {
    public static void main(String[] args) {
        TransaksiSwalayan pelanggan1 = new TransaksiSwalayan("John Doe", "3800000001", "silver", 100000);
        TransaksiSwalayan pelanggan2 = new TransaksiSwalayan("Jane Doe", "5600000001", "gold", 500000);
        TransaksiSwalayan pelanggan3 = new TransaksiSwalayan("Bob Smith", "7400000001", "platinum", 1000000);
    
        pelanggan1.beli(500000, "3800000001", 1234);
        pelanggan1.cekSaldo("3800000001", 1234);
    
        pelanggan2.beli(1500000, "5600000001", 5678);
        pelanggan2.cekSaldo("5600000001", 5678);
    
        pelanggan3.beli(2000000, "7400000001", 9012);
        pelanggan3.cekSaldo("7400000001", 9012);
    
        pelanggan1.topUp(50000, "3800000001", 1234);
        pelanggan1.cekSaldo("3800000001", 1234);
    
        pelanggan2.topUp(100000, "5600000001", 5678);
        pelanggan2.cekSaldo("5600000001", 5678);
    
        pelanggan3.topUp(500000, "7400000001", 9012);
        pelanggan3.cekSaldo("7400000001", 9012);
    }
}
