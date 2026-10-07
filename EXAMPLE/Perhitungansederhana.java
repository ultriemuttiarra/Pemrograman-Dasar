/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Perhitungansederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama : ");
        int angkaPertama = input.nextInt();
        
        System.out.println("Masukkan angka kedua : ");
        int angkaKedua = input.nextInt();
        
        System.out.println("Hasil Penjumlahan = " + (angkaPertama + angkaKedua));
        System.out.println("Hasil Penjumlahan = " + (angkaPertama - angkaKedua));
        System.out.println("Hasil Penjumlahan = " + (angkaPertama * angkaKedua));
        System.out.println("Hasil Penjumlahan = " + (angkaPertama / angkaKedua));
        
        input.close();
    }
}
