package PRAKTIKUMLOOPING;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Sistempresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jumlah total mahasiswa : ");
        int totalMahasiswa = input.nextInt();
        
        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;
        
        System.out.println("Data kehadiran (1 = Hadir, 0 = Tidak Hadir) : ");
        for (int i = 1; i <= totalMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + i + " : ");
            int status = input.nextInt();
            
            if (status == 1) {
                jumlahHadir++;
            } else if (status == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid! Masukkan angka 1 atau 0.");
                i--;
            }
        }
        double persentaseKehadiran = ((double) jumlahHadir / totalMahasiswa) * 100;
        System.out.println("PRESENSI MAHASISWA");
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
        System.out.println("Jumlah Hadir : " + jumlahHadir);
        System.out.println("Jumlah Tidak Hadir : " + jumlahTidakHadir);
        System.out.printf("Persentase Kehadiran: %.2f%%", persentaseKehadiran);
        
        if (persentaseKehadiran >= 75) {
            System.out.println("Status Keseluruhan : Memenuhi syarat");
        } else {
            System.out.println("Status Keseluruhan : Tidak memenuhi syarat");
        }
        input.close();
    }
}
