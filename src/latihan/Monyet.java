package latihan;

public class Monyet extends Hewan{
   public String suara; 

   Monyet(){

   }

    Monyet(String nama, int umur, String suara){
    super(nama, umur);
    this.suara = suara;
    }

    public void print(){
      System.out.println("Sarah: halo, ini peliharaanku " + nama + " berumur " + umur + " bulan.");
      System.out.println("Gigi: " + suara);
    }
  

}
