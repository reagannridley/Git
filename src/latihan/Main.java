package latihan;

public class Main {
    public static void main(String[] args) {
        Kucing k1 = new Kucing("Molly", 8, "Meowww");
        // System.out.println(k1.nama);
        // System.out.println(k1.umur);
        // System.out.println(k1.suara);

        System.out.println("");
        k1.print();

        Monyet m1 = new Monyet("Gigi", 12, "u u a a");
        System.out.println("");
        m1.print();

        Anjing a1 = new Anjing("Yuya", 9, "Bark bark");
        System.out.println("");
        a1.print();
    }
}
