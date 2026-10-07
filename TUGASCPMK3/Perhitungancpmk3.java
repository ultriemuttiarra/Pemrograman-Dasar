/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TUGASCPMK3;
import java.util.Scanner;
import java.lang.Math;



public class Perhitungancpmk3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kode;
        int a, b;

        System.out.println("Masukkan angka pertama : ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua : ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Kode Z untuk penjumlahan.");
        System.out.println("Kode N untuk pengurangan.");
        System.out.println("Kode R untuk perkalian.");
        System.out.println("Kode M untuk pembagian.");
        kode = input.nextLine();
        if (kode.equals("Z")) {
            System.out.println("Hasil penjumlahan = " + (a + b));
        } else {
            if (kode.equals("N")) {
                System.out.println("Hasil Pengurangan = " + (a - b) );
            } else {
                if (kode.equals("R")) {
                    System.out.println("Hasil Perkalian = " + (a * b));
                } else {
                    if (kode.equals("M")) {
                        System.out.println("Hasil Pembagian = " + (a / b));
                    }
                }
                input.close();
            }
        }
    }
}


