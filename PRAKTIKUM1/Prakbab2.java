// Identitas Diri
// NIM : 09010626037
// Nama : Ultri Mutiara Ramadhani
// Modul Praktikum Bab 2
package PRAKTIKUM1;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Prakbab2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama Donatur : ");
        String nama = input.nextLine();
        System.out.println("Jumlah Donasi : Rp");
        double donasi = input.nextDouble();
        input.nextLine();
        System.out.println("Kode Transaksi : ");
        String kode = input.nextLine();
        System.out.println("Donasi Anonim? (True/False) : ");
        boolean anonim = input.nextBoolean();
        System.out.println("DATA DONASI");
        System.out.println("Nama : " + nama);
        System.out.println("Donasi : Rp " + donasi);
        System.out.println("Kode : " + kode);
        System.out.println("Anonim : " + anonim);
        input.close();
    }
}
