package METHOD;
import java.util.Scanner;

public class PROGRAM_MODULAR {
    static Scanner input = new Scanner(System.in);
    
    static int inputJumlahBulan() {
        System.out.print("Masukkan Jumlah Bulan : ");
        int jumlahBulan = input.nextInt();
        return jumlahBulan;
    }

    static int[] hitungTabungan(int jumlahBulan) {
        int tabunganBulanan = 100000;
        int kenaikan = 50000;
        int totalTabungan = 0;
        int bulanTarget = 0;

        for (int i = 1; i <= jumlahBulan; i++) {
            if (i > 1) {
                tabunganBulanan += kenaikan;
            }
            totalTabungan += tabunganBulanan;
            System.out.println("Bulan ke-" + i + " : Rp" + tabunganBulanan);

            if (totalTabungan >= 1000000 && bulanTarget == 0) {
                bulanTarget = i;
            }
        }
        return new int[]{totalTabungan, bulanTarget};
    }

    static void tampilHasil(int[] hasil) {
        System.out.println("HASIL SIMULASI TABUNGAN");
        System.out.println("Total Tabungan Akhir : Rp" + hasil[0]);
        
        if (hasil[1] != 0) {
            System.out.println("Target Rp1.000.000 Tercapai pada Bulan Ke-" + hasil[1]);
        } else {
            System.out.println("Target Rp1.000.000 Belum Tercapai.");
        }
    }

    public static void main(String[] args) {
        int jumlahBulan = inputJumlahBulan();
        int[] hasil = hitungTabungan(jumlahBulan);
        tampilHasil(hasil);
        input.close();
    }
}
