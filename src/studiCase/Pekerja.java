package studiCase;

import java.time.LocalDate;

public class Pekerja extends Manusia{
private double gaji;
private LocalDate tahunMasuk;
private int jumlahAnak;
public Pekerja(String nama, int usia, boolean
b, String alamat, double gaji, LocalDate
tahunMasuk, int jumlahAnak, String nik, boolean
menikah) {
super(nama, menikah, nik, menikah);
this.gaji = gaji;
this.tahunMasuk = tahunMasuk;
this.jumlahAnak = jumlahAnak;}

public void setGaji(double gaji) {
this.gaji = gaji;
}
public double getGaji() {
return gaji;
}
public void setTahunMasuk(LocalDate tahunMasuk)
{
this.tahunMasuk = tahunMasuk;
}
public LocalDate getTahunMasuk() {
return tahunMasuk;
}
public void setJumlahAnak(int jumlahAnak) {
this.jumlahAnak = jumlahAnak;
}
public int getJumlahAnak() {
return jumlahAnak;
}
public double getBonus() {
LocalDate now = LocalDate.now();
int lamaBekerja = now.getYear();
if (lamaBekerja >= 0 && lamaBekerja < 5) {
return 0.05 * gaji;
} else if (lamaBekerja >= 5 && lamaBekerja <
10) {
return 0.1 * gaji;
} else {
return 0.15 * gaji;
}
}
public double getTunjangan() {
return jumlahAnak * 20;
}
public double getGajiTotal(){
return gaji + getBonus() + getTunjangan();
}
public String toString() {
return super.toString() + ", Tahun Masuk: " + tahunMasuk + ", Jumlah Anak: " + jumlahAnak;
}
}
