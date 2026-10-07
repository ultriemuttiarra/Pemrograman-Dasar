/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ARRAY;

/**
 *
 * @author TIARA
 */
public class Prakcaridata {

    public static void main(String[] args) {
        int[] nilai = { 80, 75, 90, 85, 70};
        
        int cari = 90;
        int posisi = -1;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Data ditemukan pada indeks " + posisi);
        }
    }
}
