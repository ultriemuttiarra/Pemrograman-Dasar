/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ARRAY;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Prakpenjualankantin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        int total = 0;
        int hari = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
        }
        int max = penjualan[0];
        int min = penjualan[0];
        
        for (int i = 0; i < penjualan.length; i++) {
            total += penjualan[i];
            
            if (penjualan[i] >= 30) hari++;
            if (penjualan[i] > max) max = penjualan[i];
            if (penjualan[i] < min) min = penjualan[i];
        }
        double rataRata = (double) total / penjualan.length;
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Total = " + total);
        System.out.println("Rata-rata = "  + rataRata);
        System.out.println("Penjualan tertinggi = " + max);
        System.out.println("Penjualan terendah = " + min);
        System.out.println("Hari = " + hari);
    }
}
