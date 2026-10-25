package ARRAY_MULTIDIMENSI;
import java.util.Scanner;

public class Pengembangan_Array {
    static Scanner input = new Scanner(System.in);
    static int inputUkuran(String pesan) {
        int ukuran;
        
        do {
            System.out.print(pesan);
            ukuran = input.nextInt();
            
            if (ukuran <= 0) {
                System.out.println("Ukuran harus lebih dari 0!");
            }
        } while (ukuran <= 0);
        return ukuran;
    }
    
    static String[][][] inputData(int prodi, int kelas, int mahasiswa) {
        String[][][] data = new String[prodi][kelas][mahasiswa];
        input.nextLine();
        
        for(int i = 0; i < prodi; i++) {
            System.out.println("Program Studi : " + (i + 1));
            
            for(int j = 0; j < kelas; j++) {
                System.out.println("Kelas : " + (j + 1));
                
                for(int k = 0; k < mahasiswa; k++) {
                    System.out.println("Nama Mahasiswa ke-" + (k + 1) + " : ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }
        return data;
    }
    
    static void tampilkanData(String[][][] data) {
        System.out.println("DATA MAHASISWA");
        
        for(int i = 0; i < data.length; i++) {
            System.out.println("Program Studi : " + (i + 1));
            
            for(int j = 0; j < data[i].length; j++) {
                System.out.println("Kelas : " + (j + 1));
                
                for(int k = 0; k < data[i][j].length; k++) {
                    System.out.println("Nama Mahasiswa ke-" + (k + 1) + ". " + data[i][j][k]);
                    
                }
            }
        }
    }
    
    static void operasiString(String[][][] data) {
        System.out.println("OPERASI STRING");
        
        System.out.print("Masukkan Nama Mahasiswa yang Dicari : ");
        String cari = input.nextLine();
        boolean ditemukan = false;
        
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                for(int k = 0; k< data[i][j].length; k++) {
                    String nama = data[i][j][k];
                    
                    if (nama.equalsIgnoreCase(cari)) {
                        System.out.println("Nama Ditemukan!");
                        System.out.println("Nama : " + nama);
                        System.out.println("Huruf Kapital : " + nama.toUpperCase());
                        System.out.println("Huruf Kecil : " + nama.toLowerCase());
                        System.out.println("Jumlah Karakter : " + nama.length());
                        System.out.println("Program Studi : " + (i + 1));
                        System.out.println("Kelas : "+ (j + 1));
                        
                        ditemukan = true;
                        
                    }
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Nama Mahasiswa Tidak Ditemukan.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("DATA MAHASISWA");
        int prodi = inputUkuran("Jumlah Program Studi : ");
        int kelas = inputUkuran("Jumlah Kelas Setiap Prodi : ");
        int mahasiswa = inputUkuran("Jumlah Mahasiswa Setiap Kelas : ");
        
        String[][][] dataMahasiswa = inputData(prodi, kelas, mahasiswa);
        tampilkanData(dataMahasiswa);
        operasiString(dataMahasiswa);
        
        input.close();
    }
}
