package PRAKTIKUMLOOPING;
import java.util.Scanner;
/**
 *
 * @author TIARA
 */
public class Tabelperkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        
        System.out.println("TABEL PERKALIAN" + angka);
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}
