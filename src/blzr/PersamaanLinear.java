package blzr;

public class PersamaanLinear {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    PersamaanLinear(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public int getD(){
        return this.d;
    }

    public int getE(){
        return this.e;
    }

    public int getF(){
        return this.f;
    }

    public boolean isSolvable(int a, int b, int c, int d){
        int kalisilang = a*d - b*c;
        if(kalisilang != 0){
            return true;
        } return false;
    }

    public double getX(int a, int b, int c, int d, int e, int f){
        double x = (e*d - b*f)/(a*d - b*c);
        return x;
    }

    public double getY(int a, int b, int c, int d, int e, int f){
        double y = (a*f - e*c)/(a*d - b*c);
        return y;
    }
}
