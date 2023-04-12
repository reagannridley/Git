package methodImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Akar Persamaan Kuadrat");

        System.out.print("Masukkan value untuk a: ");
        int a = in.nextInt();
        System.out.print("Masukkan value untuk b: ");
        int b = in.nextInt();
        System.out.print("Masukkan value untuk c: ");
        int c = in.nextInt();
        
        PersamaanKuadrat pk = new PersamaanKuadrat(a, b, c);
       
        if(pk.getDiskriminan() > 0){
        System.out.println("AKAR 1 : " + pk.getAkar1(a, b, c));
        System.out.println("AKAR 2 : " + pk.getAkar2(a, b, c));
        } else if(pk.getDiskriminan() < 0){
            System.out.println("0");
        } else if(pk.getDiskriminan() == 0){
            System.out.println("AKAR: " + pk.getAkar1(a, b, c));
        } else{
            System.out.println("Persamaan tidak memiliki akar.");
        }
    }

   
}
