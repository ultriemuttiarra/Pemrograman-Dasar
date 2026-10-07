package BINTANG;
import java.util.Scanner;
/**
 *
 * @author TIARA
 */
public class Polabintang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
