package challenge;

public class gatau {
    private String namaMahasiswa;
    private double nilaiUts;
    private double nilaiUas;

    public gatau(String nama, double uts, double uas) {
        this.namaMahasiswa = nama;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
    }

    public String getNama() {
        return namaMahasiswa;
    }

    public void setNama(String nama) {
        this.namaMahasiswa = nama;
    }

    public double getUts() {
        return nilaiUts;
    }

    public void setUts(double uts) {
        this.nilaiUts = uts;
    }

    public double getUas() {
        return nilaiUas;
    }

    public void setUas(double uas) {
        this.nilaiUas = uas;
    }

    public boolean isLulus() {
        double nilaiAkhir = 0.5 * (nilaiUts + nilaiUas);
        return nilaiAkhir >= 75;
    }

    public void tampilkanKeterangan() {
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Keterangan: " + (isLulus() ? "lulus" : "tidak lulus"));

    }
}
