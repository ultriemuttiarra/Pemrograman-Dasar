/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TUGASCPMK2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Tebakangka {

    public static void main(String[] args) {
        Random acak = new Random();
        Scanner input = new Scanner(System.in);
        
        int angkaTarget = acak.nextInt(100) + 1;
        int tebakan;
        int jumlahPercobaan = 0;
        final int MAKS_PERCOBAAN = 7;
        
        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Komputer memilih angka antara 1 sampai 100.");
        System.out.println("Kamu punya maksimal " + MAKS_PERCOBAAN + " kali percobaan!\n");
        
        while (jumlahPercobaan < MAKS_PERCOBAAN) {
            System.out.println("Percobaan ke-" + (jumlahPercobaan + 1) + " - Masukkan tebakanmu : ");
            tebakan = input.nextInt();
            jumlahPercobaan++;
            
            if (tebakan < angkaTarget) {
                System.out.println("Terlalu kecil. Coba lagi!\n");
            } else if (tebakan > angkaTarget) {
                System.out.println("Terlalu besar. Coba lagi!\n");
            } else {
                
                System.out.println("\n BENAR!! Kamu berhasil menebak angka " + angkaTarget);
                System.out.println("Jumlah percobaan : " + jumlahPercobaan + " kali");
                break;
            }
        }
        if (jumlahPercobaan >= MAKS_PERCOBAAN) {
            System.out.println("\n sayang sekali, kesempatanmu sudah habis!");
            System.out.println("Angka yang benar adalah: " +angkaTarget);
        }
        input.close();
    }
}
