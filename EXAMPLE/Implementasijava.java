//Identitas Diri
// NIM : 09010626037
// Nama : Ultri Mutiara Ramadhani
// Modul Praktikum Implementasi Java

package EXAMPLE;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Implementasijava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ipk;
        double penghasilan;
        int tanggungan;
        String aktifSosial;
        String beasiswaLain;
        System.out.println("Masukkan IPK: ");
        ipk = input.nextDouble();
        System.out.println("Masukkan penghasilan orang tua: ");
        penghasilan = input.nextDouble();
        System.out.println("Masukkan jumlah tanggungan: ");
        tanggungan = input.nextInt();
        input.nextLine();
        System.out.println( "Aktif Kegiatan? (Yes/No): ");
        aktifSosial = input.nextLine();
        System.out.println( "Menerima Beasiswa Lain? (Yes/No): ");
        beasiswaLain = input.nextLine();
    }
}
