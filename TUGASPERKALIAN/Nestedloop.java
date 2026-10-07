/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TUGASPERKALIAN;
import java.util.Scanner;
import java.lang.Math;

public class Nestedloop {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, angka;

        i = 0;
        System.out.println("Masukkan angka : ");
        angka = input.nextInt();
        while (i <= 10) {
            System.out.println(Integer.toString(angka) + " * " + i + "= " + i * angka);
            i = i + 1;
        }
    }
}
