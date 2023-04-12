package latihan;

public class Anjing extends Hewan {
    public String suara;
    Anjing(){

    }

    Anjing(String nama, int umur, String suara){
        super(nama, umur);
        this.suara = suara;
    }

    public void print(){
        System.out.println("Liz: halo, ini peliharaanku " + nama + " berumur " + umur + " bulan.");
        System.out.println("Yuya: " + suara);
     }
  
}
