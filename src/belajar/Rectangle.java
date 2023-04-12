package belajar;

public class Rectangle {
    double panjang, lebar;

    Rectangle(){
        this.panjang = 1;
        this.lebar = 1;
    }

    Rectangle(double newPanjang, double newLebar){
        this.panjang = newPanjang;
        this.lebar = newLebar;
    }

    double getLuas(){
        return panjang * lebar;
    }

    double getKeliling(){
        return 2 * panjang + 2 * lebar;
    }
}
