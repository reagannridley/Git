package latihan;

public class Kucing extends Hewan {
    public String suara;

    Kucing(){

    }

    Kucing(String nama, int umur, String suara){
        super(nama, umur);
        this.suara = suara;
    }

    public void print(){
        System.out.println("Selma: halo, ini peliharaanku " + nama + " berumur " + umur + " bulan.");
        System.out.println("Molly: " + suara);
     }
  
}
