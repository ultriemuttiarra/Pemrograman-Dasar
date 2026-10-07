/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TUGASCPMK2;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Sistemparkir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" SISTEM PARKIR KAMPUS ");
        System.out.println("Masukkan jenis kendaraan : ");
        String jenisKendaraan = input.nextLine().toLowerCase();
        
        System.out.println("Masukkan lama parkir : ");
        int lamaParkir = input.nextInt();
        
        int tarifAwal = 0;
        int tarifTambahanPerJam = 0;
        
        if (jenisKendaraan.equals("motor")) {
            tarifAwal = 2000;
            tarifTambahanPerJam = 1000;
        } else if (jenisKendaraan.equals("mobil")) {
            tarifAwal = 5000;
            tarifTambahanPerJam = 2000;
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            input.close();
            return;
        }
        int biayaTambahan = (lamaParkir -1) * tarifTambahanPerJam;
        if (biayaTambahan < 0) biayaTambahan  = 0;
        int totalBiaya = tarifAwal + biayaTambahan;
        
        System.out.println("=== RINCIAN BIAYA PARKIR ===");
        System.out.println("Jenis Kendaraan : " + jenisKendaraan.toUpperCase());
        System.out.println("Lama Parkir : " + lamaParkir + " jam");
        System.out.println("Tarif Awal : Rp "+ tarifAwal);
        System.out.println("Biaya Tambahan : Rp " + biayaTambahan);
        System.out.println("===========");
        System.out.println("TOTAL BIAYA : Rp " + totalBiaya);
        input.close();
    }
}
