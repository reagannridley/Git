package sistem;

import java.util.Scanner;

public class TransaksiSwalayan {
    private String nama;
    private String nomorPelanggan;
    private String jenisRekening;
    private double saldo;
    private int kesalahanAutentifikasi;

    public TransaksiSwalayan(String nama, String nomorPelanggan, String jenisRekening, double saldo) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.jenisRekening = jenisRekening;
        this.saldo = saldo;
        this.kesalahanAutentifikasi = 0;
    }

    public void beli(double jumlahPembelian, String nomorPelanggan, int pin) {
        if (this.nomorPelanggan.equals(nomorPelanggan) && this.kesalahanAutentifikasi < 3) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan PIN: ");
            int inputPin = input.nextInt();

            if (inputPin == pin) {
                if (jumlahPembelian > 1000000) {
                    if (this.jenisRekening.equals("silver")) {
                        this.saldo += jumlahPembelian * 0.05;
                    } else if (this.jenisRekening.equals("gold")) {
                        this.saldo += jumlahPembelian * 0.02;
                    } else if (this.jenisRekening.equals("platinum")) {
                        this.saldo += jumlahPembelian * 0.15;
                    }
                } else {
                    if (this.jenisRekening.equals("gold")) {
                        this.saldo += jumlahPembelian * 0.02;
                    } else if (this.jenisRekening.equals("platinum")) {
                        this.saldo += jumlahPembelian * 0.05;
                    }
                }
            } else {
                this.kesalahanAutentifikasi++;
                System.out.println("PIN salah. Kesalahan autentifikasi: " + this.kesalahanAutentifikasi);
            }
        } else {
            System.out.println("Nomor pelanggan salah atau akun diblokir.");
        }
    }

    public void topUp(double jumlahTopUp, String nomorPelanggan, int pin) {
        if (this.nomorPelanggan.equals(nomorPelanggan) && this.kesalahanAutentifikasi < 3) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan PIN: ");
            int inputPin = input.nextInt();

            if (inputPin == pin) {
                this.saldo += jumlahTopUp;
            } else {
                this.kesalahanAutentifikasi++;
                System.out.println("PIN salah. Kesalahan autentifikasi: " + this.kesalahanAutentifikasi);
            }
        } else {
            System.out.println("Nomor pelanggan salah atau akun diblokir.");
        }
    }

    public void cekSaldo(String nomorPelanggan, int pin) {
        if (this.nomorPelanggan.equals(nomorPelanggan) && this.kesalahanAutentifikasi < 3) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan PIN: ");
            int inputPin = input.nextInt();

            if (inputPin == pin) {
                System.out.println("Saldo Anda: " + this.saldo);
            } else {
                this.kesalahanAutentifikasi++;
                System.out.println("PIN salah. Kesalahan autentifikasi: " + this.kesalahanAutentifikasi);
            }
        } else {
            System.out.println("Nomor pelanggan salah atau akun diblokir.");
        }
    }

}