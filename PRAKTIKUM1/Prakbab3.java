//Identitas Diri
// NIM : 09010626037
// Nama : Ultri Mutiara Ramadhani
// Modul Praktikum Bab 3

package PRAKTIKUM1;
import java.util.Scanner;

public class Prakbab3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total Beras : ");
        int totalBeras = input.nextInt();
        System.out.println("Jumlah Keluarga yang Menerima : ");
        int jumlahKeluarga = input.nextInt();
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
        System.out.println("PEMBAGIANN BERAS");
        System.out.println("Beras per Keluarga : " + berasPerKeluarga + " Kg");
        System.out.println("Sisa Beras : " + sisaBeras + " Kg");
        int sisaDalamGram = sisaBeras * 1000;
        int tambahanGram = sisaDalamGram / jumlahKeluarga;
        System.out.println("Tambahan per Keluarga : " +tambahanGram + " Gram");
        input.close();
    }
}
