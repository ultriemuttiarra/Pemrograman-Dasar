package PRAKTIKUMLOOPING;
import java.util.Scanner;
/**
 *
 * @author TIARA
 */
public class Menupola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("MENU POLA");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.println("Menu : ");
            menu = input.nextInt();
            
            switch (menu) {
                case 1: {
                    System.out.print("Masukkan tinggi segitiga : ");
                    int tinggi = input.nextInt();
                    
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.print("Masukkan tinggi ssegitiga terbalik : ");
                    int tinggi = input.nextInt();
                    
                    for (int i = tinggi; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Masukkan ukuran sisi persegi : ");
                    int sisi = input.nextInt();
                    
                    for (int i = 1; i <= sisi; i++) {
                        for (int j = 1; j <= sisi; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Masukkan tinggi piramida : ");
                    int tinggi = input.nextInt();
                    
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Masukkan tinggi diamond (bagian atas) : ");
                    int tinggi = input.nextInt();
                    
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                            System.out.println();
                        }
                    for (int i = tinggi - 1; i >= 1; i--) {
                        for (int j = 1; j <= tinggi - i; j++) {
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                        break;
                    }
                case 6:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-6 : ");
                    break;
                    }
                } while (menu != 6);
        }
}