package belajar;

public class Main {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,6);
        Rectangle r3 = new Rectangle(3.5,7.5);

        System.out.println("");
        System.out.println("-------------RECTANGLE 1------------- ");
        System.out.println("Panjang : " + r1.panjang);
        System.out.println("Lebar : " + r1.lebar);
        System.out.println("Luas : " + r1.getLuas());
        System.out.println("Luas : " + r1.getKeliling());

        
        System.out.println("");
        System.out.println("-------------RECTANGLE 2------------- ");
        System.out.println("Panjang : " + r2.panjang);
        System.out.println("Lebar : " + r2.lebar);
        System.out.println("Luas : " + r2.getLuas());
        System.out.println("Luas : " + r2.getKeliling());

        
        System.out.println("");
        System.out.println("-------------RECTANGLE 3------------- ");
        System.out.println("Panjang : " + r3.panjang);
        System.out.println("Lebar : " + r3.lebar);
        System.out.println("Luas : " + r3.getLuas());
        System.out.println("Luas : " + r3.getKeliling());
    }
}
