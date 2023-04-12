public class Siswa {
    private String nama; //attribute
    private String nim;
    private String kelas;

    public Siswa(){ //constructor default

    }
    public Siswa(String nama, String nim){  //ngeset nama dama absen
        this.nama = nama;
        this.nim = nim;
    }

    public Siswa(String nama, String nim, String kelas){  //ngeset smua atribut
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }
    public void print(){
        System.out.println(nama + " dengan no induk mahasiswa " + nim + " merupakan siswa kelas " + kelas);
    }
}
