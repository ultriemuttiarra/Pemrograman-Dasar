package PRAKTIKUMLOOPING;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Perulangancabang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int totalMahasiswa = 5;
        double totalNilai = 0;
        
         for (int i = 1; i <= 5; i++) {
             System.out.println("Masukkan nilai mahasiswa ke- " + i + ": ");
              int nilai = input.nextInt();
              totalNilai += nilai;
              
              if (nilai >= 75) {
                  System.out.println("Status: Lulus");
                  jumlahLulus++;
              }else {
                  System.out.println("Status: Tidak Lulus");
                  jumlahTidakLulus++;
              }
              System.out.println("==============");
         }
         double rataRata = totalNilai / totalMahasiswa;
         System.out.println("RATA-RATA");
         System.out.println("Mahasiswa lulus : " + jumlahLulus);
         System.out.println("Mahasiswa tidak lulus : " + jumlahTidakLulus);
         System.out.println("Rata-rata : " + rataRata);
    }
}
