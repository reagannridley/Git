package studiCase;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, int usia, boolean
    b, String alamat, double gaji, LocalDate
    tahunMasuk, int jumlahAnak, String nik, boolean
    menikah, String departemen) {
        super(nama, usia, b, alamat, gaji, tahunMasuk, jumlahAnak, nik, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 0.1 * getGaji();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartemen: " + departemen;
    }
}

