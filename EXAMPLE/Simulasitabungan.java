/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Simulasitabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah bulan : ");
        int jumlahBulan = input.nextInt();
        
        System.out.println();
        
        int tabunganBulanan = 100000;
        int kenaikan = 50000;
        int totalTabungan = 0;
        int bulanTarget = 0;
        
        for (int i = 1; i <= jumlahBulan; i++) {
            if (i > 1) {
                tabunganBulanan += kenaikan;
            }
        }
        int i = input.nextInt();
        totalTabungan += tabunganBulanan;
        System.out.println("Bulan ke-" + i + " : Rp" + tabunganBulanan);
        if (totalTabungan >= 1000000 && bulanTarget == 0) {
            bulanTarget = i;
        }
        System.out.println("Total tabungan akhir : Rp" + totalTabungan);
    }
}
