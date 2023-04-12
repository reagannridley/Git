package methodImplementation;

public class PersamaanKuadrat {
    private int a;
    private int b;
    private int c;

    PersamaanKuadrat(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }

    public int getDiskriminan(){
        int diskriminan = b * b - 4 * a * c;
        return diskriminan;
    }

    public double getAkar1(int a, int b, int c){
        double akar1 = ((-b + Math.sqrt(getDiskriminan())) / 2*a);
        return akar1;
    }

    public double getAkar2(int a, int b, int c){
        double akar2 = ((-b - Math.sqrt(getDiskriminan())) / 2*a);
        return akar2;
    }

}
