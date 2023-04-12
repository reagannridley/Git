package studiCase;

public class MahasiswaFilkom extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, boolean jenisKelamin, String nim, boolean menikah, double ipk){
        super(nama, jenisKelamin, nim, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        if (nim != null) {
            String prodi = "";
            int angkatan = Integer.parseInt(nim.substring(0, 2));
            int kodeProdi = Integer.parseInt(nim.substring(6, 7));
            switch (kodeProdi) {
                case 2:
                    prodi = "Teknik Informatika";
                    break;
                case 3:
                    prodi = "Teknik Komputer";
                    break;
                case 4:
                    prodi = "Sistem Informasi";
                    break;
                case 6:
                    prodi = "Pendidikan Teknologi Informasi";
                    break;
                case 7:
                    prodi = "Teknologi Informasi";
                    break;
                default:
                    prodi = "Unknown";
            }
            return prodi + ", 20" + String.valueOf(angkatan);
        } else {
            return "NIM belum diisi";
        }
    }
    
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) {
            return 50.0;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }
    
    public String toString() {
        return super.toString() + ", NIM: " + nim + ", IPK: " + ipk + ", Status: " + getStatus();
    }
}


