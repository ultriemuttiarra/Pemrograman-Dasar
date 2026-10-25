/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METHOD;

/**
 *
 * @author TIARA
 */
public class methodsederhana {
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    static void cetakHasil(double hasil) {
        System.out.println(hasil);
    }
    
    public static void main (String[] args) {
        double luas = luasPersegiPanjang(5, 3);
        cetakHasil(luas);
    }
}
