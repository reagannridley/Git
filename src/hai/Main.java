package hai;

public class Main {
    public static void main(String[] args) {
        Kipas k1 = new Kipas();

        k1.setSpeed("FAST");
        k1.setRadius(10);
        k1.setWarna("Kuning");
        k1.setOn();

        System.out.println(k1.toString());
        System.out.println("\n============================\n");

        Kipas k2 = new Kipas();
        k2.setSpeed("MEDIUM");
        k2.setRadius(5);
        k2.setWarna("Biru");
        k2.setOff();

        System.out.println(k2.toString());
        System.out.println("\n============================\n");
    }
}
