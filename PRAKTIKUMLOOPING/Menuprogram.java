package PRAKTIKUMLOOPING;


import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Menuprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("MENU");
            System.out.println("Tampilkan angka 1-10");
            System.out.println("Tampilkan bilangan genap");
            System.out.println("Menghitung jumlah 1-10");
            System.out.println("Menggambar segitiga bintang");
            System.out.println("Keluar");
            System.out.println("Pilihan anda : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Angka 1-10");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println("Bilangan Genap (1-20)");
                    for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " ");
                    }
                }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("Menghitung Jumlah 1-10");
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i;
                    }
                    System.out.println("Jumlah total dari 1 sampai 10 adalah : " + total);
                    break;
                    
                case 4:
                    System.out.println("Segitiga Bintang");
                    System.out.println("Masukkan tinggi segitiga : ");
                    int tinggi = input.nextInt();
                    
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 5:
                    System.out.println("Terimakasih sudah menggunakan program ini!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Tolong masukkan angka 1-5.");
                    break;
            } 
        } while (pilihan != 5);
        input.close();
    }
}
