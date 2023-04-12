package inheritance;


public class Main {
    public static void main(String[] args) {
        Staf staf1 = new Staf("Selma", "085784338725", 19, "Redaksi" ); //kita buat objek dr parent class
        System.out.println(staf1.nama);
        System.out.println(staf1.noTelp);
        System.out.println(staf1.umur);
        System.out.println(staf1.divisi);
        
        staf1.sayHi();
    }

   
    
}
