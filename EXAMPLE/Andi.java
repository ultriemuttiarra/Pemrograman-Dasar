/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author TIARA
 */
public class Andi {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String jenis;
        String txt = "NASIAYAM";
        int nasiAyam = 15000;
        int airMineral = 5000;
        int total = nasiAyam + airMineral;
        int bayar = 50000;
        int kembalian = bayar - (bayar * total);
        
        System.out.println("Nasi Ayam : " + (nasiAyam + 15000) );
        System.out.println("Air Mineral : " + (airMineral + 5000));
        System.out.println("Uang Bayar : " + (bayar));
        System.out.println("Kembalian : " + (bayar - total));
        
        
        
    }
}
