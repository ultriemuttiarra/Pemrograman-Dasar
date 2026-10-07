/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EXAMPLE;

/**
 *
 * @author TIARA
 */
public class Prakwhile {

    public static void main(String[] args) {
        int baris = 5;
        int bintang = 1;
        while (bintang <= baris) {
            int kolom = 1;
            
            while (kolom <= bintang) {
                System.out.print("*");
                kolom++;
            }
            System.out.println( );
            bintang++;
        }
    }
}