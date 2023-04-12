package inheritance;

public class Karyawan {
    String nama;
    String noTelp;
    int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    Karyawan(){

    }

    Karyawan(String nama, String noTelp, int umur){
        this.nama = nama;
        this.noTelp = noTelp;
        this.umur = umur;
    }

    void sayHi(){
        System.out.println("Hello " + nama);
    }
}
