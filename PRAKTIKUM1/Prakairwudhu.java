//Identitas Diri
// NIM : 09010626037
// Nama : Ultri Mutiara Ramadhani
// Modul Praktikum Air Wudhu

package PRAKTIKUM1;
import java.util.*;
import java.lang.Math;

/**
 *
 * @author TIARA
 */

public class Prakairwudhu {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahMahasiswa, jumlahWudhu;
        double airPerWudhu, totalAir, hemat, totalAirHemat;

        System.out.println("Jumlah Mahasiswa : ");
        jumlahMahasiswa = input.nextInt();
        System.out.println("Jumlah Wudhu Sehari : ");
        jumlahWudhu = input.nextInt();
        System.out.println("Total Air 1 Orang : ");
        airPerWudhu = input.nextDouble();
        totalAir = jumlahMahasiswa * jumlahWudhu * airPerWudhu;
        hemat = totalAir * 0.15;
        totalAirHemat = totalAir - hemat;
        System.out.println("Total Air dalam sehari :  " + totalAir);
        System.out.println("Total Air Setelah Penghematan : " + totalAirHemat);
        System.out.println("Hemat Air : " + hemat);
    }
}


