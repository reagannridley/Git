package pertemuan3;

public class settergetter {
    private String namaMahasiswa;
    private double nilaiUTS;
    private double nilaiUAS;
    private String lulus;

    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(double nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUTS(){
        return nilaiUTS;
    }

    public void setNilaiUts(double nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUAS(){
        return nilaiUAS;
    }
    
    public String getLulus(){
        double nilaiAkhir = (nilaiUTS + nilaiUAS)/2;
        if(nilaiAkhir >= 75){
            return "lulus";
        } else return "tidak lulus";
    }

}
