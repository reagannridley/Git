package inheritance;

public class Staf extends Karyawan {
    String divisi;
    
    Staf(){

    }

    Staf(String nama, String noTelp, int umur, String divisi){
       
        super(nama, noTelp, umur); //manggil atribut yg ada di parent class
        this.divisi = divisi;
    }

    void sayHi(){

        System.out.println("Halo, saya " + nama + " dari divisi " + divisi);
    }
}
