package studiCase;

public class Manusia {
    private String nama;
    protected boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private String lulusan;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public boolean isMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if (menikah) {
            if (jenisKelamin) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }


    public String toString(){
        String jk = "";
        if (jenisKelamin) {
            jk = "Laki-laki";
        } else {
            jk = "Perempuan";
        }
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + jk + "\nPendapatan: " + getPendapatan();
    }

    public String toString2(){
        String Status = "";
        if (menikah) {
            Status = "Menikah";
        } else {
            Status = "Belum menikah";
        }
        return "Status: " + Status; 
    }
    }
    

