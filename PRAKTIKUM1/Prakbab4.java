//Identitas Diri
// NIM : 09010626037
// Nama : Ultri Mutiara Ramadhani
// Modul Praktikum Bab 4

package PRAKTIKUM1;
import java.util.Scanner;
import java.lang.Math;

public class Prakbab4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int memenuhi, tidak, iPK, hafalan;

        System.out.println("Masukkan IPK : ");
        iPK = input.nextInt();
        System.out.println("Masukkan Hafalan : ");
        hafalan = input.nextInt();
        if (iPK >= 3.25 && hafalan >= 5) {
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Tidak memenuhi syarat beasiswa.");
        }
    }
}
