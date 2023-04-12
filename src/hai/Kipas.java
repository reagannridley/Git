package hai;
public class Kipas {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String warna;

    Kipas(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.warna = "biru";
    }

    public int getSpeed(){
        return this.speed;
    }
    public boolean isOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getWarna(){
        return this.warna;
    }
    
    public void setSpeed(String speed){
        switch(speed){
            case "SLOW":
            this.speed = 1;

            case "MEDIUM":
            this.speed = 2;

            case "FAST":
            this.speed = 3;
        }

    }

    public void setOn(){
        this.on = true;
    }
    public void setOff(){
        this.on = false;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String toString(){
        if(on){
            return "Kipas nyala\n" + "Kecepatan kipas: " + this.speed + "\nRadius kipas: " + this.radius + "\nWarna kipas: " + this.warna; 
        }
        return "Kipas mati\n" + "Warna kipas: " + this.warna + "\nRadius: " + this.radius;  
    }
}


