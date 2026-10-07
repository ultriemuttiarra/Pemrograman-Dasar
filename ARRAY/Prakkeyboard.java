package ARRAY;
import java.util.Scanner;

/**
 *
 * @author TIARA
 */
public class Prakkeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int [5];
        
        for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
        nilai[i] = input.nextInt();
    }
        System.out.println("\nData nilai : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
    }
}
