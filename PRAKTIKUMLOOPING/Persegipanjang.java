/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUMLOOPING;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Persegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan baris : ");
        int baris = input.nextInt();
        
        System.out.println("Masukkan kolom : ");
        int kolom = input.nextInt();
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
