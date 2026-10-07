/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TUGASCPMK2;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Zakat {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("PERHITUNGAN ZAKAT MAL");
        System.out.println("======================");
        
        double totalHarta;
        double nilaiNisab;
        double jumlahZakat;
        
        System.out.print("Masukkan total harta : ");
        totalHarta = input.nextDouble();
        
        System.out.print("Masukkan nilai nisab : ");
        nilaiNisab = input.nextDouble();
        
        if (totalHarta >= nilaiNisab) {
            jumlahZakat = totalHarta * 0.025;
            
            System.out.println("Harta mencapai nisab.");
            System.out.println("Zakat yang harus dibayar = Rp  " + jumlahZakat);
        }
        else {
            System.out.println("Harta belum mencapai nisab.");
        }   
        
        input.close();
        
    }
}
