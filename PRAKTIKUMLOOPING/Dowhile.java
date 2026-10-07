/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUMLOOPING;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Dowhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.println("Masukkan angka (0 untuk berhenti) : ");
            angka = input.nextInt();
            System.out.println("Masukkan angka anda : " + angka);
        } while (angka !=0);
        System.out.println("Pragram selesai.");
    }
}
