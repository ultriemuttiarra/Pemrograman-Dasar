/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ARRAY;

/**
 *
 * @author TIARA
 */
public class Prakjumlahlulus {

    public static void main(String[] args) {
        int[] nilai = {80, 75, 90,85};
        int jumlahLulus = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 75) {
                jumlahLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
    }
}
