package PRAKTIKUMLOOPING;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int n = input.nextInt();
        System.out.println("Bilangan 1 sampai " + n + " ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "");
        }
        System.out.println();
        
        System.out.println("Bilangan genap (angka 1 sampai " + n + ")");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("Bilangan ganjil (angka 1 sampai " + n + ")");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();     
    }
}

