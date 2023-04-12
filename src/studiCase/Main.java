package studiCase;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("James Moriarty", true, "123456789", true);
        System.out.println("TESTCASE MANUSIA");

        System.out.println(manusia1.toString());
        System.out.println(manusia1.toString2());
        System.out.println("-----------------------");

        Manusia manusia2 = new Manusia("Makise Kurisu", false, "111111111", false);
        System.out.println(manusia2.toString());
        System.out.println(manusia2.toString2());
        System.out.println("------------------------");

        Manusia manusia3 = new Manusia("Sherlock Holmes", true, "222222222", false);
        System.out.println(manusia3.toString());
        System.out.println(manusia2.toString2());
        System.out.println("------------------------");

        System.out.println("                    ");

        System.out.println("TESTCASE MAHASISWA");
        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Elisabet", false, "225150600111032", false, 3.92);
        System.out.println(mahasiswa1.toString());
        System.out.println("------------------------");

        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Nana Osaki", false, "215150200111050", false, 3.25);
        System.out.println(mahasiswa2.toString());
        System.out.println("------------------------");

        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Nana Komatsu", false, "225150100111055", false, 2.9);
        System.out.println(mahasiswa3.toString());
        System.out.println("------------------------");
        System.out.println("                    ");
        
        System.out.println("TESTCASE PEKERJA");
        LocalDate tahunMasuk1 = LocalDate.of(2021, 4, 1);
        Pekerja pekerja1 = new Pekerja("Lain Iwakura", 15, false, "CantBeFoundCity", 7500, tahunMasuk1, 2, "123476",  false);
        System.out.println(pekerja1.toString());
        System.out.println("Bonus: " + pekerja1.getBonus());
        System.out.println("Tunjangan: " + pekerja1.getTunjangan());
        System.out.println("Gaji total: " + pekerja1.getGajiTotal());
        System.out.println("----------------------------------------------");
        System.out.println("      ");

        LocalDate tahunMasuk2 = LocalDate.of(2014, 4, 1);
        Pekerja pekerja2 = new Pekerja("Reagan Ridley", 30, false, "ConspirashiTown", 750000, tahunMasuk2, 0,"696969696", false);
        System.out.println(pekerja2.toString());
        System.out.println("Bonus: " + pekerja1.getBonus());
        System.out.println("Tunjangan: " + pekerja1.getTunjangan());
        System.out.println("Gaji total: " + pekerja1.getGajiTotal());
        System.out.println("----------------------------------------------");
        System.out.println("      ");

        LocalDate tahunMasuk3 = LocalDate.of(2003, 4, 1);
        Pekerja pekerja3 = new Pekerja("Matt Maltese", 100, true, "Salt Lake City", 10000,  tahunMasuk3, 10, "12711444567", true);
        System.out.println(pekerja3.toString()); 
        System.out.println("Bonus: " + pekerja1.getBonus());
        System.out.println("Tunjangan: " + pekerja1.getTunjangan());
        System.out.println("Gaji total: " + pekerja1.getGajiTotal());
        System.out.println("----------------------------------------------");
        System.out.println("      ");

        System.out.println("TESTCASE MANAGER");
        Manager manager = new Manager("Liz", 16, false, "In Her Delusional Mind", 7500, tahunMasuk3, 0, "2234567", false,"Fucked up Person Dept.");
        System.out.println("Bonus: " + pekerja1.getBonus());
        System.out.println("Tunjangan: " + pekerja1.getTunjangan());
        System.out.println("Gaji total: " + pekerja1.getGajiTotal());
        System.out.println(manager.toString());


    }
}

