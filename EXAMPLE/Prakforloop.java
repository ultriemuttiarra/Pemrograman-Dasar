/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;

/**
 *
 * @author TIARA
 */
public class Prakforloop {

    public static void main(String[] args) {
        int barisBintang = 5;
        
        for (int bintang = 1; bintang <= barisBintang; bintang++) {
            for (int kolom = 1; kolom <= bintang; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
