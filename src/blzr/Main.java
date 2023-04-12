package blzr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM PERSAMAAN LINEAR 2x2");
        System.out.println("                                ");
        System.out.print("Masukkan value untuk a: ");
        int a = in.nextInt();
        System.out.print("Masukkan value untuk b: ");
        int b = in.nextInt();
        System.out.print("Masukkan value untuk c: ");
        int c = in.nextInt();
        System.out.print("Masukkan value untuk d: ");
        int d = in.nextInt();
        System.out.print("Masukkan value untuk e: ");
        int e = in.nextInt();
        System.out.print("Masukkan value untuk f: ");
        int f = in.nextInt();

        PersamaanLinear Pl = new PersamaanLinear(a, b, c, d, e, f);
        
        if(Pl.isSolvable(a, b, c, d)){
            System.out.println("Persamaan ini memiliki solusi: ");
            System.out.println(" x = " + Pl.getX(a, b, c, d, e, f));
            System.out.println(" y = " + Pl.getY(a, b, c, d, e, f));
        } else {
            System.out.println("Persamaan tak punya solusi.");
        }

       
        
    }
    }

